package com.healthcloud.service.shopping;

import java.util.List;

import com.healthcloud.domain.shopping.Order;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 上午9:29:35
* 订单业务类
*/
public interface OrderService {

	//添加订单
	int add(Order resource);
	

	//查询订单
	Order queryOne(int id);
	
	//查询订单
	List<Order> queryList(Order order);
	
	//查询所有订单
	List<Order> queryAll();
	
	//更新订单
	void update(Order resource);
	
	//删除订单
	void delete(int id);
	
}
