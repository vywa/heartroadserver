package com.healthcloud.domain.score;
/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月20日 上午11:51:56
* 等级规则
*/
public class LevelRule {

	private int id;
	private String name;
	private String description;
	private int startCount;
	private int endCount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStartCount() {
		return startCount;
	}
	public void setStartCount(int startCount) {
		this.startCount = startCount;
	}
	public int getEndCount() {
		return endCount;
	}
	public void setEndCount(int endCount) {
		this.endCount = endCount;
	}
	
	
	
}
