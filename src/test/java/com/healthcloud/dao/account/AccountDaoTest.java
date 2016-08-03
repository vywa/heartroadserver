package com.healthcloud.dao.account;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.healthcloud.SpringTest;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月23日 上午11:22:52
* 类说明
*/
public class AccountDaoTest extends SpringTest{

	private static Logger log = LoggerFactory.getLogger(AccountDaoTest.class);
	
	
	@Resource
	private AccountDao accountDao;
	
	@Test
	public void test() {
		/*
		Account account = new Account();
		account.setCatagory(1);
		account.setEmail("panbaoan@thealth.cn");
		account.setPassword("666666");
		account.setCreateTime(new Date());
		account.setLastUpdateTime(new Date());
		accountDao.add(account);
		log.info("添加数据成功");
		
		Account result = accountDao.queryById(10024);
		log.info(result.toString());
		*/
		
		
	}
	
	

}
