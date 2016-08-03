package com.healthcloud.domain.rank;

import java.util.Date;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月21日 上午10:18:34
* 类说明
*/
public class Rank {

	private int id;
	private int name;
	private int description;
	private int count;
	private Date rankTime;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
	public Date getRankTime() {
		return rankTime;
	}
	public void setRankTime(Date rankTime) {
		this.rankTime = rankTime;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
