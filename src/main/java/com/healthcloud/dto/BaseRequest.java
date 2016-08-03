package com.healthcloud.dto;

import java.io.Serializable;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午11:24:16
* 类说明
*/
public class BaseRequest implements Serializable{
	private String sum;						//摘要
	private String token;					//令牌
	
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
