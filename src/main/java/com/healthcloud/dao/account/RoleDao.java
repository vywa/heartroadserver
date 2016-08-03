package com.healthcloud.dao.account;

import java.util.List;

import com.healthcloud.domain.account.Role;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 角色接口
*/
public interface RoleDao {

	/*
	 *  添加角色
	 * */
	int add(Role role);
	
	/*
	 *  条件查询角色
	 * */
	List<Role> query(Role role);
	
	/*
	 *  查询角色
	 * */
	Role queryOne(Role role);
	
	/*
	 *  查询所有角色
	 * */
	List<Role> queryAll();
	
	/*
	 *  查询某个角色
	 * */
	Role queryById(int id);
	
	
	/*
	 *  更新角色信息
	 * */
	int update(Role role);

	
	/*
	 *  删除角色
	 * */
	void delete(int id);
	
	
	
}
