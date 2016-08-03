package com.healthcloud.service.impl.shopping;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.shopping.OrderDao;
import com.healthcloud.domain.shopping.Order;
import com.healthcloud.service.shopping.OrderService;
import com.healthcloud.util.encrypt.MD5Util;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午3:39:17
* 订单业务类
*/
@Service
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderDao orderDao;

	@Override
	public int add(Order order) {
		// TODO Auto-generated method stub
		order.setCreateTime(new Date());
		String orderId = new Date().toGMTString()+order.getDetail()+order.getTotalFee();
		orderId = MD5Util.string2MD5(orderId);
		order.setOrderId(orderId);
		orderDao.add(order);
		return 0;
	}

	/*
	 *  查找订单
	 * */
	@Override
	public Order queryOne(int id) {
		// TODO Auto-generated method stub
		return orderDao.queryById(id);
	}

	@Override
	public List<Order> queryList(Order order) {
		// TODO Auto-generated method stub
		return orderDao.query(order);
	}
	
	
	@Override
	public List<Order> queryAll() {
		// TODO Auto-generated method stub
		return orderDao.queryAll();
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		orderDao.update(order);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		orderDao.delete(id);
	}


	
	

}
