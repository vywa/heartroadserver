package com.healthcloud.service.score;

import java.util.List;

import com.healthcloud.domain.score.ScoreChange;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 积分变动业务类
*/
public interface ScoreChangeService {

	//添加积分变动
	int add(ScoreChange resource);
	
	//添加积分变动
	void addScoreChange(ScoreChange roleResource);
	
	//查询积分变动
	ScoreChange find(int id);
	
	//查询所有积分变动
	List<ScoreChange> queryAll();
	
	//更新积分变动
	void update(ScoreChange resource);
	
	//删除积分变动
	void delete(int id);
	
}
