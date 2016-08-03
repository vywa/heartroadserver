package com.healthcloud.dao.account;

import java.util.List;

import com.healthcloud.domain.account.Resource;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 资源接口
*/
public interface ResourceDao {

	/*
	 *  添加资源
	 * */
	int add(Resource resource);
	
	/*
	 *  条件查询资源
	 * */
	List<Resource> query(Resource resource);
	
	/*
	 *  条件查询
	 * */
	Resource queryOne(Resource resource);
	
	/*
	 *  查询所有资源
	 * */
	List<Resource> queryAll();
	
	/*
	 *  查询某个资源
	 * */
	Resource queryById(int id);
	
	
	/*
	 *  更新资源信息
	 * */
	int update(Resource resource);

	
	/*
	 *  删除资源
	 * */
	void delete(int id);
	
	
	
}
