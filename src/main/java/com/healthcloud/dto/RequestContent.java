package com.healthcloud.dto;

import java.io.Serializable;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午10:27:24
* 数据接收类
*/
public class RequestContent<T> extends BaseRequest implements Serializable{

	
	private T data;								//数据内容

	
	

	public RequestContent(T data) {
		super();
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public RequestContent() {
		super();
	}
	
	
	
	
}
