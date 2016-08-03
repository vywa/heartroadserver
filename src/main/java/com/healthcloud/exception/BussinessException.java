package com.healthcloud.exception;
/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午10:07:37
* 业务类异常基类
*/
public class BussinessException extends RuntimeException{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BussinessException(String message) {
		super();
		this.message = message;
	}

	public BussinessException() {
		super();
	}
	
	
	
}
