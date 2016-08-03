package com.healthcloud.dao.score;

import java.util.List;

import com.healthcloud.domain.score.LevelChange;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 等级变化接口
*/
public interface LevelChangeDao {

	/*
	 *  添加等级变化
	 * */
	int add(LevelChange role);
	
	/*
	 *  条件查询等级变化
	 * */
	List<LevelChange> query(LevelChange role);
	
	/*
	 *  查询等级变化
	 * */
	LevelChange queryOne(LevelChange role);
	
	/*
	 *  查询所有等级变化
	 * */
	List<LevelChange> queryAll();
	
	/*
	 *  查询某个等级变化
	 * */
	LevelChange queryById(int id);
	
	
	/*
	 *  更新等级变化信息
	 * */
	int update(LevelChange role);

	
	/*
	 *  删除等级变化
	 * */
	void delete(int id);
	
	
	
}
