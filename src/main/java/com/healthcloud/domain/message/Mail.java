package com.healthcloud.domain.message;

import java.io.Serializable;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月27日 上午9:29:53
* 邮箱
*/
public class Mail implements Serializable {

	private String from;							//设置发件人email
	private String subject;						//设置发送主题
	private String content;						//设置邮件内容
	private String to;									//设置收件人
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
}
