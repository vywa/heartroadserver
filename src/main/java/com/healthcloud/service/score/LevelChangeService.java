package com.healthcloud.service.score;

import java.util.List;

import com.healthcloud.domain.score.LevelChange;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 等级变动业务类
*/
public interface LevelChangeService {

	//添加等级变动
	int add(LevelChange resource);
	
	//添加等级变动
	void addLevelChange(LevelChange roleResource);
	
	//查询等级变动
	LevelChange find(int id);
	
	//查询所有等级变动
	List<LevelChange> queryAll();
	
	//更新等级变动
	void update(LevelChange resource);
	
	//删除等级变动
	void delete(int id);
	
}
