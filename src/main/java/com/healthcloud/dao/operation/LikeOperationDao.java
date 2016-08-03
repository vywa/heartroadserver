package com.healthcloud.dao.operation;

import com.healthcloud.domain.operation.LikeOperation;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月13日 下午5:30:52
* 点赞操作
*/
public interface LikeOperationDao {

	/*
	 *  添加点赞
	 * */
	void add(LikeOperation lo);
	
	/*
	 *  查询点赞
	 * */
	LikeOperation query(LikeOperation lo);
}
