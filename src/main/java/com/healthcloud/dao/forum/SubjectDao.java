package com.healthcloud.dao.forum;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.healthcloud.domain.forum.Subject;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午9:03:08
*	帖子数据访问接口
*/
public interface SubjectDao {
	
	/*
	 *  添加帖子
	 * */
	 void add(Subject subject);
	
	 /*
	  *  按关键字查找帖子
	  * */
	List<Subject> keyFind(@Param("key") String key,@Param("start") int start,@Param("limit") int limit);
	
	/*
	 *  查找某人发送的帖子
	 * */
	List<Subject> findSubjectByAuthor(@Param("authorId") int authorId,@Param("start") int start,@Param("limit") int limit);
	
	/*
	 *  删除帖子
	 * */
	void delete(int id);
	
	/*
	 *  回复帖子
	 * */
	void reply(int id);
	
	/*
	 *  浏览次数
	 * */
	void view(int id);
	
	/*
	 *  点赞次数
	 * */
	void like(int id);
	
	/*
	 *  加精
	 * */
	void perfect(int id);
	
}
