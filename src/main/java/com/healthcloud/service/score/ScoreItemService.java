package com.healthcloud.service.score;

import java.util.List;

import com.healthcloud.domain.score.ScoreItem;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 积分项目业务类
*/
public interface ScoreItemService {

	//添加积分项目
	int add(ScoreItem resource);
	
	//添加积分项目
	void addScoreItem(ScoreItem roleResource);
	
	//查询积分项目
	ScoreItem find(int id);
	
	//查询所有积分项目
	List<ScoreItem> queryAll();
	
	//更新积分项目
	void update(ScoreItem resource);
	
	//删除积分项目
	void delete(int id);
	
}
