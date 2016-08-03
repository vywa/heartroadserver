package com.healthcloud.dao.message;

import com.healthcloud.domain.message.DailyNews;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月23日 上午11:08:10
* 类说明
*/
public interface DailyNewsDao {

	/*
	 *  添加一条资讯
	 * */
	void add(DailyNews dailyNews);
	
	/*
	 *  id查询资讯
	 * */
	DailyNews findById(int id);
}
