package com.healthcloud.dao.account;

import java.util.List;

import com.healthcloud.domain.account.Account;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:01
* 账号数据接口
*/
public interface AccountDao {

	/*
	 *  添加账号
	 * */
	int add(Account account);
	
	/*
	 *  条件查询
	 * */
	List<Account> query(Account account);
	
	/*
	 *  条件查询
	 * */
	Account queryOne(Account account);
	
	/*
	 *  查询所有账号
	 * */
	List<Account> queryAll();
	
	/*
	 *  查询某个用户
	 * */
	Account queryById(int id);
	
	
	/*
	 *  更新账号信息
	 * */
	int update(Account account);

	
	/*
	 *  删除账号
	 * */
	void delete(int id);
	
	
	
}
