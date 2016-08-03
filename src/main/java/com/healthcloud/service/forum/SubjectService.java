package com.healthcloud.service.forum;

import java.util.List;

import com.healthcloud.domain.forum.Subject;
import com.healthcloud.dto.forum.SubjectResult;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午10:38:31
* 帖子业务接口
*/
public interface SubjectService {

	/*
	 *  发送帖子
	 * */
	void add(Subject subject) ;
	
	/*
	 *  查询某人帖子列表
	 * */
	List<SubjectResult> queryList(int authorId,int start,int limit);
	
	/*
	 *  按时间查找帖子
	 * */
	
	List<SubjectResult> queryAll(int start,int limit);
	
	
	/*
	 *  查询某条帖子
	 * */
	SubjectResult querySubject(int id);
	
	/*
	 *  删除某个帖子
	 * */
	void delete(int id);
	
	/*
	 *  加精某个帖子
	 * */
	void perfect(int id);
	
	/*
	 *  点赞
	 * */
	int like(int id,int userId);
	
	/*
	 *  收藏
	 * */
	int collection(int id,int userId);
	
	
}
