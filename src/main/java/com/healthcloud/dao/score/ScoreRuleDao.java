package com.healthcloud.dao.score;

import java.util.List;

import com.healthcloud.domain.score.ScoreRule;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 积分规则接口
*/
public interface ScoreRuleDao {

	/*
	 *  添加积分规则
	 * */
	int add(ScoreRule scoreRule);
	
	/*
	 *  条件查询积分规则
	 * */
	List<ScoreRule> query(ScoreRule role);
	
	/*
	 *  查询积分规则
	 * */
	ScoreRule queryOne(ScoreRule role);
	
	/*
	 *  查询所有积分规则
	 * */
	List<ScoreRule> queryAll();
	
	/*
	 *  查询某个积分规则
	 * */
	ScoreRule queryById(int id);
	
	
	/*
	 *  更新积分规则信息
	 * */
	int update(ScoreRule role);

	
	/*
	 *  删除积分规则
	 * */
	void delete(int id);
	
	
	
}
