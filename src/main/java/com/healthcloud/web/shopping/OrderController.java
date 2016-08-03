package com.healthcloud.web.shopping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.healthcloud.common.shopping.ShopUtil;
import com.healthcloud.domain.shopping.HttpXmlUtils;
import com.healthcloud.domain.shopping.Order;
import com.healthcloud.domain.shopping.WXPayResult;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.dto.shopping.OrderRequest;
import com.healthcloud.service.shopping.OrderService;
import com.healthcloud.util.encrypt.MD5Util;


/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:06:01
* 订单控制器
*/
@RestController
@RequestMapping("order")
public class OrderController {

	private static final Logger log = LoggerFactory.getLogger(OrderController.class);
	
	@Resource
	private OrderService orderService;
	

	/*
	 * 
	 *  添加订单
	 * 
	 * */
	@RequestMapping(value = "/test2", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String bindRelative(@RequestParam String data, HttpServletRequest request) {
	//	JSONObject jsonObject = JSONUtil.parseObject(data);
		OrderRequest orderRequest = new OrderRequest();
		String appid = "wxbeb7e0e79e4dd40f";
		String appSecret = "59eb8e37dcfb893c5a9db20a7d9123e7";
		String mch_id = "1362225902";
		String nonce_str = "hengyunkejirandom";
		orderRequest.setAppid(appid);
		orderRequest.setMch_id(mch_id);
		orderRequest.setDevice_info("WEB");
		orderRequest.setNonce_str(nonce_str);
		orderRequest.setBody("sanqifen");
		orderRequest.setDetail("sanqifenhengyunkeji");
		orderRequest.setFee_type("CNY");
		orderRequest.setTrade_type("APP");
	
		orderRequest.setSpbill_create_ip("123.56.200.202");
		orderRequest.setTotal_fee(500);
		orderRequest.setOut_trade_no("2016729001");
		
		String sign = "appid=wxbeb7e0e79e4dd40f&body=sanqifen&device_info=WEB&mch_id=1362225902&nonce_str=hengyunkejirandom";
		String signTemp=sign+"&key=beijnghengyunkejitianhengyiliao";
		sign=MD5Util.string2MD5(signTemp).toUpperCase();
		System.out.println("签名结果为："+sign);
		orderRequest.setSign(sign);
		HttpResponse result = ShopUtil.orderRequest(orderRequest);
					int code = result.getStatusLine().getStatusCode();
					if(code == 200){
						String resData=null;
						try {
							resData = EntityUtils.toString(result.getEntity());
							System.out.println("返回码为: "+code+"返回内容为: "+resData);
						} catch (ParseException | IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				
					
					} else {
						String resData=null;
						try {
							resData = EntityUtils.toString(result.getEntity());
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("返回码为: "+code+"返回内容为: "+resData);
					}
					ResponseCode responseCode = new ResponseCode();
					responseCode.setCode(206);
					responseCode.setMessage("添加成功");
					return JSON.toJSONString(responseCode);
			} 


	/*
	 * 生成订单
	 * */
	@RequestMapping(value="/test",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String test(HttpServletRequest request){
		//int userId = (int)request.getAttribute("userId");
		
	
		

		String wxUrl = "http://localhost:8180/healthcloudserver/order/receive?tocken=9134141f27e567c5e3722056f6a1fd1c";
		
		//String method = "POST";
		WXPayResult xXPayResult = new WXPayResult();
		xXPayResult.setResult_code("SUCCESS");
		xXPayResult.setReturn_code("SUCCESS");
		xXPayResult.setOut_trade_no("xxxxxxxxxx");
		String xmlInfo = HttpXmlUtils.xmlInfo(xXPayResult);
		System.out.println(xmlInfo);
		  DefaultHttpClient httpClient = new DefaultHttpClient();  
			//连接
	        HttpPost method = new HttpPost(wxUrl);  
	        //method.addHeader("Content-Type", "application/json");
	        HttpResponse ssresponse=null;
				//StringEntity entity = new StringEntity(xmlData,"text/xml","utf-8");
				method.setEntity(
			             new StringEntity(
			            		 xmlInfo,
			                 ContentType.create("text/xml", "utf-8")
			             )
			         );
				try {
					 ssresponse= httpClient.execute(method);
					 int code =ssresponse.getStatusLine().getStatusCode();
					 InputStreamReader inputStreamReader = new InputStreamReader( ssresponse.getEntity().getContent(), "utf-8");
						BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
						String str = null;
						StringBuffer buffer = new StringBuffer();
						while ((str = bufferedReader.readLine()) != null) {
							buffer.append(str);
						}
					System.out.println("返回码为: "+code+"返回内容为: "+buffer.toString());
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
		
	//	String weixinPost = HttpXmlUtils.httpsRequest(wxUrl, method, xmlInfo).toString();
		
		//System.out.println(weixinPost);
		
		//Map<String,String> resultResponse = ParseXMLUtils.jdomParseXml(weixinPost);
		
		
	
		ResponseCode result = new ResponseCode();
		result.setCode(206);
		result.setMessage("返回了");
		 return  JSONObject.toJSONString(result);
	}
	
	
	/*
	 *  显示所有订单
	 * */
	@RequestMapping(value="/show",method=RequestMethod.POST)
	
	public ResponseResult<Order> showPost(@RequestBody RequestContent<Integer> data){
		 
		 int id = data.getData();
		 Order md = orderService.queryOne(id);
		 ResponseResult<Order> result = new ResponseResult<Order>();
		 result.setCode(206);
		 result.setContent(md);
		 result.setMessage("查询成功");
		 return result;
	}
	
	/*
	 *  显示所有订单
	 * */
	@RequestMapping(value="/cancel",method=RequestMethod.POST)
	
	public ResponseCode cancelOrder(@RequestBody RequestContent<Integer> data){
		 int id = data.getData();
		 //取消订单
		  orderService.delete(id);
		  ResponseCode result = new ResponseCode();
		 result.setCode(206);
		 result.setMessage("取消订单成功");
		 return result;
	}
	
	

}
