package com.healthcloud.domain.rank;
/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月21日 上午10:25:39
* 等级条目
*/
public class RankItem {

	private int id;
	private int catagory;
	private int score;
	private String name;
	private int rankListId;
	
	
	
	
	public int getRankListId() {
		return rankListId;
	}
	public void setRankListId(int rankListId) {
		this.rankListId = rankListId;
	}
	public int getCatagory() {
		return catagory;
	}
	public void setCatagory(int catagory) {
		this.catagory = catagory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
