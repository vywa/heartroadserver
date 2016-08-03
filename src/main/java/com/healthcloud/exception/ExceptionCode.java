package com.healthcloud.exception;
/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午10:15:35
* 异常码
*/
public enum ExceptionCode {

	SubjectNotExist(400,"帖子不存在");
	
	
	private int code;
	private String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private ExceptionCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
}
