package com.healthcloud.dao.score;

import java.util.List;

import com.healthcloud.domain.score.ScoreItem;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 积分项目接口
*/
public interface ScoreItemDao {

	/*
	 *  添加积分项目
	 * */
	int add(ScoreItem role);
	
	/*
	 *  条件查询积分项目
	 * */
	List<ScoreItem> query(ScoreItem role);
	
	/*
	 *  查询积分项目
	 * */
	ScoreItem queryOne(ScoreItem role);
	
	/*
	 *  查询所有积分项目
	 * */
	List<ScoreItem> queryAll();
	
	/*
	 *  查询某个积分项目
	 * */
	ScoreItem queryById(int id);
	
	
	/*
	 *  更新积分项目信息
	 * */
	int update(ScoreItem role);

	
	/*
	 *  删除积分项目
	 * */
	void delete(int id);
	
	
	
}
