package com.healthcloud.service.operation;

import com.healthcloud.domain.operation.CollectionOperation;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月13日 下午5:34:20
* 收藏操作
*/
public interface CollectionOperationService {

	/*
	 *  添加一条收藏
	 * */
	void add(CollectionOperation co);
	
	/*
	 *  查询收藏
	 * */
	CollectionOperation query(CollectionOperation co);
}
