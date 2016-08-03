package com.healthcloud.dao.account;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.healthcloud.SpringTest;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月23日 下午2:23:55
* 类说明
*/
public class InformationDaoTest extends SpringTest{

	private static Logger log = LoggerFactory.getLogger(InformationDaoTest.class);
	
	@Resource
	private InformationDao informationDao;
	
	@Test
	public void add(){
		/*
		Information info = new Information();
		info.setId(20014);
		info.setAddress("北京天通苑");
		info.setAge(30);
		info.setCreateTime(new Date());
		info.setWeight(76);
		info.setHeight(178);
		info.setCreateTime(new Date());
		info.setModifyTime(new Date());
		informationDao.add(info);
		log.info("添加用户信息成功");
		
		info = informationDao.queryById(20014);
		log.info(info.toString());
		*/	
				
		
	}

}
