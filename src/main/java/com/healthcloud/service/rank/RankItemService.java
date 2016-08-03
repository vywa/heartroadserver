package com.healthcloud.service.rank;

import java.util.List;

import com.healthcloud.domain.rank.RankItem;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 排行条目业务类
*/
public interface RankItemService {

	//添加排行条目
	int add(RankItem resource);
	
	//添加排行条目
	void addRankItem(RankItem roleResource);
	
	//查询排行条目
	RankItem find(int id);
	
	//查询所有排行条目
	List<RankItem> queryAll();
	
	//更新排行条目
	void update(RankItem resource);
	
	//删除排行条目
	void delete(int id);
	
}
