package com.healthcloud.service.impl.score;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.score.ScoreRuleDao;
import com.healthcloud.domain.score.ScoreRule;
import com.healthcloud.service.score.ScoreRuleService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午3:39:17
* 积分规则业务类
*/
@Service
public class ScoreRuleServiceImpl implements ScoreRuleService{

	@Resource
	private ScoreRuleDao scoreRuleDao;
	
	@Override
	public int add(ScoreRule resource) {
		// TODO Auto-generated method stub
		scoreRuleDao.add(resource);
		return 0;
	}

	@Override
	public void addScoreRule(ScoreRule scoreRule) {
		// TODO Auto-generated method stub
		scoreRuleDao.add(scoreRule);
	}

	@Override
	public ScoreRule  find(int id) {
		// TODO Auto-generated method stub
		return scoreRuleDao.queryById(id);
	}

	@Override
	public List<ScoreRule> queryAll() {
		// TODO Auto-generated method stub
		return scoreRuleDao.queryAll();
	}

	@Override
	public void update(ScoreRule resource) {
		// TODO Auto-generated method stub
		scoreRuleDao.update(resource);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		scoreRuleDao.delete(id);
	}

}
