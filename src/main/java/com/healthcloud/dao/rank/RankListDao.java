package com.healthcloud.dao.rank;

import java.util.List;

import com.healthcloud.domain.rank.RankList;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 排行榜接口
*/
public interface RankListDao {

	/*
	 *  添加排行榜
	 * */
	int add(RankList role);
	
	/*
	 *  条件查询排行榜
	 * */
	List<RankList> query(RankList role);
	
	/*
	 *  查询排行榜
	 * */
	RankList queryOne(RankList role);
	
	/*
	 *  查询所有排行榜
	 * */
	List<RankList> queryAll();
	
	/*
	 *  查询某个排行榜
	 * */
	RankList queryById(int id);
	
	
	/*
	 *  更新排行榜
	 * */
	int update(RankList role);

	
	/*
	 *  删除排行榜
	 * */
	void delete(int id);
	
	
	
}
