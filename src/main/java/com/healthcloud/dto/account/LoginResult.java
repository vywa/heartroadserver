package com.healthcloud.dto.account;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月28日 下午2:48:37
* 类说明
*/
public class LoginResult {

	private int userId;									//用户userId;
	private String tocken;							//tocken

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	public String getTocken() {
		return tocken;
	}

	public void setTocken(String tocken) {
		this.tocken = tocken;
	}
	
	
	
}
