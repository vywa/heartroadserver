package com.healthcloud.service.impl.operation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.operation.LikeOperationDao;
import com.healthcloud.domain.operation.LikeOperation;
import com.healthcloud.service.operation.LikeOperationService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月13日 下午5:34:56
* 点赞操作业务类
*/
@Service
public class LikeOperationServiceImpl implements LikeOperationService{

	@Resource
	private LikeOperationDao likeOperatoinDao;
	
	@Override
	public void add(LikeOperation lo) {
		// TODO Auto-generated method stub
		likeOperatoinDao.add(lo);
	}

	@Override
	public LikeOperation query(LikeOperation lo) {
		// TODO Auto-generated method stub
		return likeOperatoinDao.query(lo);
	}

}
