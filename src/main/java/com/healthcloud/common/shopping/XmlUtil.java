package com.healthcloud.common.shopping;

import com.healthcloud.dto.shopping.OrderRequest;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月27日 上午11:42:40
* 类说明
*/
public class XmlUtil {

	public  static String  orderRequestToXml(OrderRequest orderRequest){
		 String payStr = "";
	        payStr += "<xml>";
	        payStr +=    "<appid>"+orderRequest.getAppid()+"</appid>";
	        payStr +=    "<mch_id>"+orderRequest.getMch_id()+"</mch_id>";
	        payStr +=    "<device_info>"+orderRequest.getDevice_info()+"</device_info>";
	        payStr +=    "<nonce_str>"+orderRequest.getNonce_str()+"</nonce_str>";
	        payStr +=    "<sign>"+orderRequest.getSign()+"</sign>";
	        payStr +=    "<body>"+orderRequest.getBody()+"</body>";
	        payStr +=    "<detail>"+orderRequest.getDetail()+"</detail>";
	        payStr +=    "<attach>"+orderRequest.getAttach()+"</attach>";
	        payStr +=    "<out_trade_no>"+orderRequest.getOut_trade_no()+"</out_trade_no>";
	        payStr +=    "<fee_type>"+orderRequest.getFee_type()+"</fee_type>";
	        payStr +=    "<total_fee>"+orderRequest.getTotal_fee()+"</total_fee>";
	        payStr +=    "<spbill_create_ip>"+orderRequest.getSpbill_create_ip()+"</spbill_create_ip>";
	        payStr +=    "<time_start>"+orderRequest.getTime_start()+"</time_start>";
	        payStr +=    "<time_expire>"+orderRequest.getTime_expire()+"</time_expire>";
	        payStr +=    "<goods_tag>"+orderRequest.getGoods_tag()+"</goods_tag>";
	        payStr +=    "<notify_url>"+orderRequest.getNotify_url()+"</notify_url>";
	        payStr +=    "<trade_type>"+orderRequest.getTrade_type()+"</trade_type>";
	        payStr +=    "<limit_pay>"+orderRequest.getLimit_pay()+"</limit_pay>";
	        payStr +="</xml>";
	        return payStr;
		
	}
}
