package com.healthcloud.service.impl.rank;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.rank.RankListDao;
import com.healthcloud.domain.rank.RankList;
import com.healthcloud.service.rank.RankListService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午3:39:17
* 排行榜业务类
*/
@Service
public class RankListServiceImpl implements RankListService{

	@Resource
	private RankListDao rankListDao;
	
	
	@Override
	public int add(RankList resource) {
		// TODO Auto-generated method stub
		rankListDao.add(resource);
		return 0;
	}

	@Override
	public void addRankList(RankList roleResource) {
		// TODO Auto-generated method stub
		rankListDao.add(roleResource);
	}

	@Override
	public RankList find(int id) {
		// TODO Auto-generated method stub
		return rankListDao.queryById(id);
	}

	@Override
	public List<RankList> queryAll() {
		// TODO Auto-generated method stub
		return rankListDao.queryAll();
	}

	@Override
	public void update(RankList resource) {
		// TODO Auto-generated method stub
		rankListDao.update(resource);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rankListDao.delete(id);
	}

}
