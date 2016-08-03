package com.healthcloud.domain.score;

import java.util.Date;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月20日 上午11:15:06
* 积分项描述
*/
public class ScoreItem {
	private int id;
	private int catagory;
	private int item;
	private int encourage;
	private int score;
	private int ruleId;
	private Date createTime;
	
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCatagory() {
		return catagory;
	}
	public void setCatagory(int catagory) {
		this.catagory = catagory;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getEncourage() {
		return encourage;
	}
	public void setEncourage(int encourage) {
		this.encourage = encourage;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRuleId() {
		return ruleId;
	}
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}
	
	
}
