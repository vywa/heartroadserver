package com.healthcloud.dao.account;

import java.util.List;

import com.healthcloud.domain.account.RoleResource;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 角色资源接口
*/
public interface RoleResourceDao {

	/*
	 *  添加角色资源
	 * */
	int add(RoleResource roleResource);
	
	/*
	 *  条件查询角色资源
	 * */
	List<RoleResource> query(RoleResource roleResource);
	
	/*
	 *  查询角色资源
	 * */
	RoleResource queryOne(RoleResource roleResource);
	
	/*
	 *  查询所有角色资源
	 * */
	List<RoleResource> queryAll();
	
	/*
	 *  查询某个角色资源
	 * */
	RoleResource queryById(int id);
	
	
	/*
	 *  更新角色资源信息
	 * */
	int update(RoleResource roleResource);

	
	/*
	 *  删除角色资源
	 * */
	void delete(int id);
	
	
	
}
