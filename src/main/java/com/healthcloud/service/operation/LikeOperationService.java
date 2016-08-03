package com.healthcloud.service.operation;

import com.healthcloud.domain.operation.LikeOperation;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月13日 下午5:34:20
* 收藏操作
*/
public interface LikeOperationService {

	/*
	 *  添加一条点赞
	 * */
	void add(LikeOperation co);
	
	/*
	 *  查询点赞
	 * */
	LikeOperation query(LikeOperation co);
}
