package com.healthcloud.service.rank;

import java.util.List;

import com.healthcloud.domain.rank.RankList;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 排行榜业务类
*/
public interface RankListService {

	//添加排行榜
	int add(RankList resource);
	
	//添加排行榜
	void addRankList(RankList roleResource);
	
	//查询排行榜
	RankList find(int id);
	
	//查询所有排行榜
	List<RankList> queryAll();
	
	//更新排行榜
	void update(RankList resource);
	
	//删除排行榜
	void delete(int id);
	
}
