package com.healthcloud.dto.account;

import javax.validation.constraints.Pattern;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月29日 下午3:22:02
* 类说明
*/
public class SmsReceive {

	 @Pattern(regexp = "^[a-zA-Z_][\\w]{4,19}$", message="{user.name.error}")  
	private String mobilephone;
	 
	private String code;
	
	private String password;
	
	
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
