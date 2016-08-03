package com.healthcloud.dao.account;

import java.util.List;

import com.healthcloud.domain.account.Information;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午2:58:13
* 个人信息类
*/
public interface InformationDao {

	/*
	 *  添加信息
	 * */
	void addInfo(Information info);
	
	
	/*
	 *  更新信息
	 * */
	void updateInfo(Information info);
	
	/*
	 *  查询个人信息
	 * */
	List<Information> queryList(Information info);
	
	/*
	 *  获取个人信息
	 * */
	Information getInfoById(int id);
	
	/*
	 *  删除个人信息
	 * */
	void deleteById(int id);
	
	

}
