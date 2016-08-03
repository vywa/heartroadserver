package com.healthcloud.dao.account;

import java.util.List;

import com.healthcloud.domain.account.UserRole;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 用户角色接口
*/
public interface UserRoleDao {

	/*
	 *  添加用户角色
	 * */
	int add(UserRole userRole);
	
	/*
	 *  条件查询用户角色
	 * */
	List<UserRole> query(UserRole userRole);
	
	/*
	 *  查询用户角色
	 * */
	UserRole queryOne(UserRole userRole);
	
	/*
	 *  查询所有用户角色
	 * */
	List<UserRole> queryAll();
	
	/*
	 *  查询某个用户角色
	 * */
	UserRole queryById(int id);
	
	
	/*
	 *  更新用户角色信息
	 * */
	int update(UserRole userRole);

	
	
	/*
	 *  删除用户角色
	 * */
	void delete(int id);
	
	
	
}
