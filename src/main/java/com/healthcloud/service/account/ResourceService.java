package com.healthcloud.service.account;

import java.util.List;

import com.healthcloud.domain.account.Resource;
import com.healthcloud.domain.account.RoleResource;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 资源业务类
*/
public interface ResourceService {

	//添加资源
	int add(Resource resource);
	
	//添加角色资源
	void addRoleResource(RoleResource roleResource);
	
	//查询资源
	List<Resource> find(int id);
	
	//查询所有资源
	List<Resource> queryAll();
	
	//更新资源
	void update(Resource resource);
	
	//删除资源
	void delete(int id);
	
}
