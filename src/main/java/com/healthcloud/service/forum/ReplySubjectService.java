package com.healthcloud.service.forum;

import java.util.List;

import com.healthcloud.domain.forum.ReplySubject;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午10:56:38
* 回复
*/
public interface ReplySubjectService {

	/*
	 *  对某个帖子进行回复
	 * */
	void reply(ReplySubject reply);
	
	/*
	 *  删除回复
	 * */
	void delete(int id);
	
	/*
	 *  查看某个帖子的回复列表
	 * */
	List<ReplySubject> querySubject(int subjectId,int start,int limit);
}
