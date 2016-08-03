package com.healthcloud.domain.forum;

import java.io.Serializable;
import java.util.Date;



/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午9:18:52
* 回帖
*/
public class ReplySubject implements Serializable{

	private int id;																			
	
	private int 	userId;																//回复人ID
	
	private int subjectId;															//帖子id
	
	private String replyContent;												//回复内容
	
	private String replyIocInfo;												//回复内容
	
	private String replySoundUrl;												//声音地址
	
	private String replyImgUrls;													//图片回复

	private Date replyTime;														//回复时间
	
	
	private String repeatReply;													//对楼层的回复
		
	
	private int status;																	//状态
	
	
	
	public String getReplyIocInfo() {
		return replyIocInfo;
	}

	public void setReplyIocInfo(String replyIocInfo) {
		this.replyIocInfo = replyIocInfo;
	}

	public String getRepeatReply() {
		return repeatReply;
	}

	public void setRepeatReply(String repeatReply) {
		this.repeatReply = repeatReply;
	}

	public String getReplySoundUrl() {
		return replySoundUrl;
	}

	public void setReplySoundUrl(String replySoundUrl) {
		this.replySoundUrl = replySoundUrl;
	}


	public String getReplyImgUrls() {
		return replyImgUrls;
	}

	public void setReplyImgUrls(String replyImgUrls) {
		this.replyImgUrls = replyImgUrls;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}



	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	@Override
	public String toString() {
		return "ReplySubject [id=" + id + ", userId=" + userId + ", subjectId=" + subjectId + ", replyContent="
				+ replyContent + ", replyIocInfo=" + replyIocInfo + ", replySoundUrl=" + replySoundUrl
				+ ", replyImgUrls=" + replyImgUrls + ", replyTime=" + replyTime + ", repeatReply=" + repeatReply
				+ ", status=" + status + "]";
	}

	
}
