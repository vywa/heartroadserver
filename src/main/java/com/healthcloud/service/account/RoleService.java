package com.healthcloud.service.account;

import java.util.List;

import com.healthcloud.domain.account.Role;
import com.healthcloud.domain.account.UserRole;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:03
* 角色业务类
*/
public interface RoleService {

	
	
	//添加角色
	int add(Role role);
	
	//添加用户角色
	void addUserRole(UserRole userRole);
	
	//查询角色
	List<Role> findRole(int userId);
	
	//查询所有角色
	List<Role> findAll();
	
	//更新角色
	void update(Role role);
	
	//删除角色
	void deleteById(int  id);
	
	//查询角色
	Role findById(int id);
}
