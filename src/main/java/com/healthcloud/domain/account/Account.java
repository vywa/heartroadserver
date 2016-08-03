package com.healthcloud.domain.account;

import java.io.Serializable;
import java.util.Date;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:29:56
* 账号类
*/
public class Account implements Serializable{

	private int id;
	private int catagory;
	private String username;
	private String mobilephone;
	private String email;
	private String qq;
	private String wechat;
	private String webo;
	private String password;
	private Date createTime;
	private Date lastUpdateTime;
	private int source;																						//账号来源
	private int status;																						//账号状态(0正常)
	
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getWebo() {
		return webo;
	}
	public void setWebo(String webo) {
		this.webo = webo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", catagory=" + catagory + ", username=" + username + ", mobilephone="
				+ mobilephone + ", email=" + email + ", createTime=" + createTime
				+ ", lastUpdateTime=" + lastUpdateTime + ", qq=" + qq + ", wechat=" + wechat + ", webo=" + webo
				+ ", password=" + password + ", source=" + source + ", status=" + status + "]";
	}

	
	
	
}
