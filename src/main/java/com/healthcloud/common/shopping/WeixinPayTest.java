package com.healthcloud.common.shopping;


import java.util.SortedMap;
import java.util.TreeMap;

import com.healthcloud.domain.shopping.HttpXmlUtils;
import com.healthcloud.domain.shopping.ParseXMLUtils;
import com.healthcloud.domain.shopping.RandCharsUtils;
import com.healthcloud.domain.shopping.Unifiedorder;
import com.healthcloud.domain.shopping.WXSignUtils;
import com.healthcloud.domain.shopping.WeixinConfigUtils;
import com.healthcloud.util.encrypt.MD5Util;

/**
 * 微信支付测试
 * @author xiebin
 * @date 2015年11月26日上午9:58:19
 */
public class WeixinPayTest {

	@SuppressWarnings("static-access")
	public static void test() {
		WeixinConfigUtils config = new WeixinConfigUtils();
		//参数组
		String appid = config.appid;
		System.out.println("appid是："+appid);
		String mch_id = config.mch_id;
		System.out.println("mch_id是："+mch_id);
		String nonce_str = RandCharsUtils.getRandomString(16);
		System.out.println("随机字符串是："+nonce_str);
		String body = "谢彬测试微信支付0.01_2";
		String detail = "谢彬0.01_元测试开始";
		String attach = "备用参数，先留着，后面会有用的";
		String out_trade_no = "2015112500001000811017342394";
		int total_fee = 1;//单位是分，即是0.01元
		String spbill_create_ip = "127.0.0.1";
		String time_start = RandCharsUtils.timeStart();
		System.out.println(time_start);
		String time_expire = RandCharsUtils.timeExpire();
		System.out.println(time_expire);
		String notify_url = config.notify_url;
		System.out.println("notify_url是："+notify_url);
		String trade_type = "APP";
		
		
		//参数：开始生成签名
		SortedMap<Object,Object> parameters = new TreeMap<Object,Object>();
		parameters.put("appid", appid);
		parameters.put("mch_id", mch_id);
		parameters.put("nonce_str", nonce_str);
		parameters.put("body", body);
		parameters.put("nonce_str", nonce_str);
		parameters.put("detail", detail);
		parameters.put("attach", attach);
		parameters.put("out_trade_no", out_trade_no);
		parameters.put("total_fee", total_fee);
		parameters.put("time_start", time_start);
		parameters.put("time_expire", time_expire);
		parameters.put("notify_url", notify_url);
		parameters.put("trade_type", trade_type);
		parameters.put("spbill_create_ip", spbill_create_ip);
		
		String sign = WXSignUtils.createSign("UTF-8", parameters);
		System.out.println("签名是："+sign);
		
		String sign2 = "appid=wxbeb7e0e79e4dd40f&body="+"body"+"&device_info=WEB&mch_id=1362225902&nonce_str="+nonce_str;
		String signTemp=sign2+"&key=beijinghengyunkejitianhengyiliao";
		sign2=MD5Util.string2MD5(signTemp).toUpperCase();
		
		Unifiedorder unifiedorder = new Unifiedorder();
		unifiedorder.setAppid(appid);
		unifiedorder.setMch_id(mch_id);
		unifiedorder.setNonce_str(nonce_str);
		unifiedorder.setSign(sign);
		unifiedorder.setBody(body);
		unifiedorder.setDetail(detail);
		unifiedorder.setAttach(attach);
		unifiedorder.setOut_trade_no(out_trade_no);
		unifiedorder.setTotal_fee(total_fee);
		unifiedorder.setSpbill_create_ip(spbill_create_ip);
		unifiedorder.setTime_start(time_start);
		unifiedorder.setTime_expire(time_expire);
		unifiedorder.setNotify_url(notify_url);
		unifiedorder.setTrade_type(trade_type);

		
		//构造xml参数
		String xmlInfo = HttpXmlUtils.xmlInfo(unifiedorder);
		
		String wxUrl = "https://api.mch.weixin.qq.com/pay/unifiedorder";
		
		String method = "POST";
		
		String weixinPost = HttpXmlUtils.httpsRequest(wxUrl, method, xmlInfo).toString();
		
		System.out.println(weixinPost);
		
		ParseXMLUtils.jdomParseXml(weixinPost);

	}

}