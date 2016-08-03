package com.healthcloud.service.impl.account;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.healthcloud.dao.account.RoleDao;
import com.healthcloud.dao.account.UserRoleDao;
import com.healthcloud.domain.account.Role;
import com.healthcloud.domain.account.UserRole;
import com.healthcloud.service.account.RoleService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:34:44
* 角色类业务
*/
@Service
public class RoleServiceImpl implements RoleService{

	@Resource
	private RoleDao roleDao;
	
	@Resource
	private UserRoleDao userRoleDao;
	
	/*
	 *  添加角色自身
	 * */
	@Override
	public int add(Role role) {
		// TODO Auto-generated method stub
		roleDao.add(role);
		return role.getId();
	}

	/*
	 *  添加用户角色
	 * */
	@Override
	public void addUserRole(UserRole userRole) {
		// TODO Auto-generated method stub
		List<UserRole> urList = userRoleDao.query(userRole);
		if(urList == null){
			userRoleDao.add(userRole);
		} else {
			boolean exist = false;
			for(UserRole ur : urList){
				if((ur.getRoleId() == userRole.getRoleId())){
					exist = true;
					break;
				}
			}
			if(!exist){
				userRoleDao.add(userRole);
			}
		}
	}

	
	/*
	 *  删除某个角色
	 * */
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		roleDao.delete(id);
	}

	/*
	 *  查询某人的角色列表
	 * */
	@Override
	@Transactional
	public List<Role> findRole(int userId) {
		// TODO Auto-generated method stub
		UserRole userRole = new UserRole();
		//查询用户的角色列表
		List<UserRole> userRoleList = userRoleDao.query(userRole);
		List<Role> roleList = new ArrayList<Role>();
		for(UserRole ur :userRoleList){
			//查询具体角色
			Role temp = roleDao.queryById(ur.getRoleId());
			roleList.add(temp);
		}
		return roleList;
	}

	/*
	 * 更新角色名称
	 * */
	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		roleDao.update(role);
	}

	/*
	 *  查询角色
	 * */
	@Override
	public Role findById(int id) {
		// TODO Auto-generated method stub
		return roleDao.queryById(id);
		
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		List<Role> list= roleDao.queryAll();
		return list;
	}


	


}
