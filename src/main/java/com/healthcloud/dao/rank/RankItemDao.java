package com.healthcloud.dao.rank;

import java.util.List;

import com.healthcloud.domain.rank.RankItem;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 排行条目接口
*/
public interface RankItemDao {

	/*
	 *  添加排行条目
	 * */
	int add(RankItem role);
	
	/*
	 *  条件查询排行条目
	 * */
	List<RankItem> query(RankItem role);
	
	/*
	 *  查询排行条目
	 * */
	RankItem queryOne(RankItem role);
	
	/*
	 *  查询所有排行条目
	 * */
	List<RankItem> queryAll();
	
	/*
	 *  查询某个排行条目
	 * */
	RankItem queryById(int id);
	
	
	/*
	 *  更新排行条目
	 * */
	int update(RankItem role);

	
	/*
	 *  删除排行条目
	 * */
	void delete(int id);
	
	
	
}
