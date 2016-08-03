package com.healthcloud.domain.message;

import java.io.Serializable;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月27日 上午9:30:00
* 短信
*/
public class Sms implements Serializable {

	private final String account = "cf_171274409";
	private final String password="Hy_bob_2016";
	
	private String mobile;
	private String content;
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAccount() {
		return account;
	}
	public String getPassword() {
		return password;
	}
	
	
}
