package com.healthcloud.domain.login;

import java.io.Serializable;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月25日 下午3:29:40
* 类说明
*/
public class LoginInfoCache implements Serializable{

	private String tocken;							//会话标识

	private int userId;

	public String getTocken() {
		return tocken;
	}

	public void setTocken(String tocken) {
		this.tocken = tocken;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}												//用户ID
	
}
	
	
	
	
	
