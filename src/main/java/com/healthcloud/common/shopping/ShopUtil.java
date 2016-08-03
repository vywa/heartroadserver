package com.healthcloud.common.shopping;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.healthcloud.dto.shopping.OrderRequest;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月28日 上午9:57:11
* 类说明
*/
public class ShopUtil {

	public static HttpResponse  orderRequest(OrderRequest orderRequest){
	
		String requestPay = "https://api.mch.weixin.qq.com/pay/unifiedorder";
		
		String xmlData = XmlUtil.orderRequestToXml(orderRequest);
		System.out.println("发送的ｘｍｌ数据为："+xmlData);
		  DefaultHttpClient httpClient = new DefaultHttpClient();  
			//连接
	        HttpPost method = new HttpPost(requestPay);  
	        //method.addHeader("Content-Type", "application/json");
	  
				//StringEntity entity = new StringEntity(xmlData,"text/xml","utf-8");
				method.setEntity(
			             new StringEntity(
			            		 xmlData,
			                 ContentType.create("text/xml", "utf-8")
			             )
			         );
				try {
					HttpResponse response= httpClient.execute(method);
					return response;
					
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	        return null;
		
	}
}
