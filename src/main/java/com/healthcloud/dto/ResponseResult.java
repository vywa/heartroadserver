package com.healthcloud.dto;

import java.io.Serializable;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午9:29:14
* 返回结果
 * @param <T>
*/
public class  ResponseResult<T> extends ResponseCode implements Serializable{

	private T  content;										//返回内容
	
	
	
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
	
	public ResponseResult(T content) {
		super();
		this.content = content;
	}
	public ResponseResult() {
		super();
	}
	
	
	
	
}
