package com.healthcloud.service.impl.score;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.score.ScoreItemDao;
import com.healthcloud.domain.score.ScoreItem;
import com.healthcloud.service.score.ScoreItemService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午3:39:17
* 积分项目业务类
*/
@Service
public class ScoreItemServiceImpl implements ScoreItemService{

	@Resource
	private ScoreItemDao scoreItemDao;
	
	
	@Override
	public int add(ScoreItem resource) {
		// TODO Auto-generated method stub
		scoreItemDao.add(resource);
		return 0;
	}

	@Override
	public void addScoreItem(ScoreItem roleResource) {
		// TODO Auto-generated method stub
		scoreItemDao.add(roleResource);
	}

	@Override
	public ScoreItem find(int id) {
		// TODO Auto-generated method stub
		return scoreItemDao.queryById(id);
	}

	@Override
	public List<ScoreItem> queryAll() {
		// TODO Auto-generated method stub
		return scoreItemDao.queryAll();
	}

	@Override
	public void update(ScoreItem resource) {
		// TODO Auto-generated method stub
		scoreItemDao.update(resource);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		scoreItemDao.delete(id);
	}

}
