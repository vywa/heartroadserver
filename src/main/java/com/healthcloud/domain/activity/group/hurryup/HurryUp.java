package com.healthcloud.domain.activity.group.hurryup;

import java.util.Date;
import java.util.List;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月14日 下午4:14:58
* 邀请抢答(系统活动，秒杀题目)
*/
public class HurryUp {

	private int id;
	private List<Integer> questionList;
	private Date startTime;
	private Date endTime;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Integer> getQuestionList() {
		return questionList;
	}
	public void setQuestionList(List<Integer> questionList) {
		this.questionList = questionList;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
