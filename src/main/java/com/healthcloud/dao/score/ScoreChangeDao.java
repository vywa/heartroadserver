package com.healthcloud.dao.score;

import java.util.List;

import com.healthcloud.domain.score.ScoreChange;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 积分变化接口
*/
public interface ScoreChangeDao {

	/*
	 *  添加积分变化
	 * */
	int add(ScoreChange role);
	
	/*
	 *  条件查询积分变化
	 * */
	List<ScoreChange> query(ScoreChange role);
	
	/*
	 *  查询积分变化
	 * */
	ScoreChange queryOne(ScoreChange role);
	
	/*
	 *  查询所有积分变化
	 * */
	List<ScoreChange> queryAll();
	
	/*
	 *  查询某个积分变化
	 * */
	ScoreChange queryById(int id);
	
	
	/*
	 *  更新积分变化信息
	 * */
	int update(ScoreChange role);

	
	/*
	 *  删除积分变化
	 * */
	void delete(int id);
	
	
	
}
