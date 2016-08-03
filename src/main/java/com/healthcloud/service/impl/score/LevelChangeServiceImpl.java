package com.healthcloud.service.impl.score;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.score.LevelChangeDao;
import com.healthcloud.domain.score.LevelChange;
import com.healthcloud.service.score.LevelChangeService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午3:39:17
* 等级变动业务类
*/
@Service
public class LevelChangeServiceImpl implements LevelChangeService{

	@Resource
	private LevelChangeDao levelChangeDao;
	
	
	@Override
	public int add(LevelChange resource) {
		// TODO Auto-generated method stub
		levelChangeDao.add(resource);
		return 0;
	}

	@Override
	public void addLevelChange(LevelChange roleResource) {
		// TODO Auto-generated method stub
		levelChangeDao.add(roleResource);
	}

	@Override
	public LevelChange find(int id) {
		// TODO Auto-generated method stub
		return levelChangeDao.queryById(id);
	}

	@Override
	public List<LevelChange> queryAll() {
		// TODO Auto-generated method stub
		return levelChangeDao.queryAll();
	}

	@Override
	public void update(LevelChange resource) {
		// TODO Auto-generated method stub
		levelChangeDao.update(resource);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		levelChangeDao.delete(id);
	}

}
