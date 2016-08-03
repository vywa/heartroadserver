package com.healthcloud.dao.shopping;

import java.util.List;

import com.healthcloud.domain.shopping.Order;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月27日 下午3:50:18
* 订单类
*/
public interface OrderDao {

	/*
	 *  生成订单
	 * */
	void add(Order order);
	
	/*
	 *  查询订单
	 * */
	Order queryOrder(Order order);
	
	/*
	 *  查询订单
	 * */
	List<Order> query(Order order);
	
	/*
	 *  查询所有订单
	 * */
	List<Order> queryAll();
	
	/*
	 *  根据id查询订单
	 * */
	Order queryById(int id);
	
	/*
	 *  更改订单
	 * */
	void update(Order order);
	
	/*
	 *  删除订单
	 * */
	void delete(int id);
}
