package com.healthcloud.dto;
/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午9:39:01
* 返回码
*/
public enum ResultCode {

	SUCCESS(1,"206"),
	FAILURE(2,"110");
	
	private int index;
	private String code;

	private ResultCode(int index, String code) {
		this.index = index;
		this.code = code;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}


	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}

	public static String getCode(int index){
		for(ResultCode rc : ResultCode.values()){
			if(rc.getIndex() == index){
				return rc.getCode();
			}
		}
		return null;
	}
	
	
	
}
