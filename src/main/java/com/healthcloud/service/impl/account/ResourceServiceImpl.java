package com.healthcloud.service.impl.account;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.account.ResourceDao;
import com.healthcloud.dao.account.RoleResourceDao;
import com.healthcloud.domain.account.Resource;
import com.healthcloud.domain.account.RoleResource;
import com.healthcloud.service.account.ResourceService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:35:04
* 资源类业务
*/
@Service
public class ResourceServiceImpl implements ResourceService{

	@Inject
	private ResourceDao resourceDao;
	
	@Inject
	private RoleResourceDao roleResourceDao;
	/*
	 *  添加资源
	 * */
	@Override
	public int add(Resource resource) {
		// TODO Auto-generated method stub
		resourceDao.add(resource);
		return resource.getId();
	}

	/*
	 *  查询某个角色对应的资源
	 * */
	@Override
	public List<Resource> find(int id) {
		// TODO Auto-generated method stub
		RoleResource roleResource = new RoleResource();
		List<RoleResource> rrList = roleResourceDao.query(roleResource);
		List<Resource> rList = new ArrayList<Resource>();
		for(RoleResource rr :rrList){
			Resource temp = resourceDao.queryById(rr.getResourceId());
			rList.add(temp);
		}
		return rList;
	}

	/*
	 *  更新资源
	 * */
	@Override
	public void update(Resource resource) {
		// TODO Auto-generated method stub
		resourceDao.update(resource);
	}

	/*
	 *  删除资源
	 * */
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		resourceDao.delete(id);
	}

	/*
	 * 添加角色资源
	 * */
	@Override
	public void addRoleResource(RoleResource roleResource) {
		// TODO Auto-generated method stub
		List<RoleResource> rrList = roleResourceDao.query(roleResource);
		if(rrList == null){
			roleResourceDao.add(roleResource);
		}else {
			boolean exist = false;
			for(RoleResource rr : rrList){
				if((rr.getRoleId() == roleResource.getRoleId())){
					exist = true;
					break;
				}
			}
			if(!exist){
				roleResourceDao.add(roleResource);
			}
		}
	}

	/*
	 *  查询所有资源
	 * */
	@Override
	public List<Resource> queryAll() {
		// TODO Auto-generated method stub
		List<Resource> list = resourceDao.queryAll();
		return list;
	}

}
