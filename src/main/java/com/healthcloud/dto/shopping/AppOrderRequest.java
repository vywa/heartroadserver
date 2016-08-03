package com.healthcloud.dto.shopping;
/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月27日 上午10:12:03
* app端发送请求
*/
public class AppOrderRequest {

	private String appid;							//应用id
	private String partnerid;					//商户号
	private String prepayid;					//预支付会话id
	private String wpackage;					//扩展字段
	private String noncestr;					//随机字符串
	private String timestamp;				//时间戳
	private String	sign;							//签名
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getPartnerid() {
		return partnerid;
	}
	public void setPartnerid(String partnerid) {
		this.partnerid = partnerid;
	}
	public String getPrepayid() {
		return prepayid;
	}
	public void setPrepayid(String prepayid) {
		this.prepayid = prepayid;
	}
	public String getWpackage() {
		return wpackage;
	}
	public void setWpackage(String wpackage) {
		this.wpackage = wpackage;
	}
	public String getNoncestr() {
		return noncestr;
	}
	public void setNoncestr(String noncestr) {
		this.noncestr = noncestr;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
