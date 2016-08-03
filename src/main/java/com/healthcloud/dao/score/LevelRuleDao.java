package com.healthcloud.dao.score;

import java.util.List;

import com.healthcloud.domain.score.LevelRule;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 等级规则接口
*/
public interface LevelRuleDao {

	/*
	 *  添加等级规则
	 * */
	int add(LevelRule role);
	
	/*
	 *  条件查询等级规则
	 * */
	List<LevelRule> query(LevelRule role);
	
	/*
	 *  查询等级规则
	 * */
	LevelRule queryOne(LevelRule role);
	
	/*
	 *  查询所有等级规则
	 * */
	List<LevelRule> queryAll();
	
	/*
	 *  查询某个等级规则
	 * */
	LevelRule queryById(int id);
	
	
	/*
	 *  更新等级规则信息
	 * */
	int update(LevelRule role);

	
	/*
	 *  删除等级规则
	 * */
	void delete(int id);
	
	
	
}
