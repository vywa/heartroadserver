package com.healthcloud.dao.operation;

import com.healthcloud.domain.operation.CollectionOperation;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月13日 下午5:30:52
* 收藏操作
*/
public interface CollectionOperationDao {

	/*
	 *  添加收藏
	 * */
	void add(CollectionOperation co);
	
	/*
	 *  查询收藏
	 * */
	CollectionOperation query(CollectionOperation co);
}
