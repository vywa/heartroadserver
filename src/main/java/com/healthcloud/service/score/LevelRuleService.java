package com.healthcloud.service.score;

import java.util.List;

import com.healthcloud.domain.score.LevelRule;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 等级规则业务类
*/
public interface LevelRuleService {

	//添加等级规则
	int add(LevelRule resource);
	
	//添加等级规则
	void addLevelRule(LevelRule roleResource);
	
	//查询等级规则
	LevelRule find(int id);
	
	//查询所有等级规则
	List<LevelRule> queryAll();
	
	//更新等级规则
	void update(LevelRule resource);
	
	//删除等级规则
	void delete(int id);
	
}
