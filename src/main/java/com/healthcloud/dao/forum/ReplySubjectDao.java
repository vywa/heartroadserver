package com.healthcloud.dao.forum;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.healthcloud.domain.forum.ReplySubject;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午12:00:17
* 回复帖子
*/
public interface ReplySubjectDao {

	/*
	 *  回复
	 * */
	void reply(ReplySubject reply);
	
	/*
	 *  查找某个帖子的回复
	 * */
	List<ReplySubject> queryList(@Param("subjectId") int subjectId,@Param("start") int start,@Param("limit") int limit);
	
	
	/*
	 *  删除回复
	 * */
	void delete(int id);
	
	
}
