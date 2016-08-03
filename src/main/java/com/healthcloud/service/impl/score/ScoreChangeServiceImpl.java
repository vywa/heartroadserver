package com.healthcloud.service.impl.score;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.score.ScoreChangeDao;
import com.healthcloud.domain.score.ScoreChange;
import com.healthcloud.service.score.ScoreChangeService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午3:39:17
* 积分变动业务类
*/
@Service
public class ScoreChangeServiceImpl implements ScoreChangeService{

	@Resource
	private ScoreChangeDao scoreChangeDao;
	
	
	@Override
	public int add(ScoreChange resource) {
		// TODO Auto-generated method stub
		scoreChangeDao.add(resource);
		return 0;
	}

	@Override
	public void addScoreChange(ScoreChange roleResource) {
		// TODO Auto-generated method stub
		scoreChangeDao.add(roleResource);
	}

	@Override
	public ScoreChange find(int id) {
		// TODO Auto-generated method stub
		return scoreChangeDao.queryById(id);
	}

	@Override
	public List<ScoreChange> queryAll() {
		// TODO Auto-generated method stub
		return scoreChangeDao.queryAll();
	}

	@Override
	public void update(ScoreChange resource) {
		// TODO Auto-generated method stub
		scoreChangeDao.update(resource);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		scoreChangeDao.delete(id);
	}

}
