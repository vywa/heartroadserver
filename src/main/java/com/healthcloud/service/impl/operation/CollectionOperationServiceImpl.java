package com.healthcloud.service.impl.operation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.operation.CollectionOperationDao;
import com.healthcloud.domain.operation.CollectionOperation;
import com.healthcloud.service.operation.CollectionOperationService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月13日 下午5:34:56
* 收藏操作业务类
*/
@Service
public class CollectionOperationServiceImpl implements CollectionOperationService{

	@Resource
	private CollectionOperationDao collectionOperatoinDao;
	
	@Override
	public void add(CollectionOperation co) {
		// TODO Auto-generated method stub
		collectionOperatoinDao.add(co);
	}

	@Override
	public CollectionOperation query(CollectionOperation co) {
		// TODO Auto-generated method stub
		return collectionOperatoinDao.query(co);
	}

}
