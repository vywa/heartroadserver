package com.healthcloud.service.score;

import java.util.List;

import com.healthcloud.domain.score.ScoreRule;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 积分规则业务类
*/
public interface ScoreRuleService {

	//添加积分规则
	int add(ScoreRule resource);
	
	//添加积分规则
	void addScoreRule(ScoreRule roleResource);
	
	//查询积分规则
	ScoreRule find(int id);
	
	//查询所有积分规则
	List<ScoreRule> queryAll();
	
	//更新积分规则
	void update(ScoreRule resource);
	
	//删除积分规则
	void delete(int id);
	
}
