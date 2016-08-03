package com.healthcloud.service.impl.rank;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.rank.RankItemDao;
import com.healthcloud.domain.rank.RankItem;
import com.healthcloud.service.rank.RankItemService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午3:39:17
* 排行榜条目业务类
*/
@Service
public class RankItemServiceImpl implements RankItemService{

	@Resource
	private RankItemDao rankItemDao;
	
	
	@Override
	public int add(RankItem resource) {
		// TODO Auto-generated method stub
		rankItemDao.add(resource);
		return 0;
	}

	@Override
	public void addRankItem(RankItem roleResource) {
		// TODO Auto-generated method stub
		rankItemDao.add(roleResource);
	}

	@Override
	public RankItem find(int id) {
		// TODO Auto-generated method stub
		return rankItemDao.queryById(id);
	}

	@Override
	public List<RankItem> queryAll() {
		// TODO Auto-generated method stub
		return rankItemDao.queryAll();
	}

	@Override
	public void update(RankItem resource) {
		// TODO Auto-generated method stub
		rankItemDao.update(resource);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rankItemDao.delete(id);
	}

}
