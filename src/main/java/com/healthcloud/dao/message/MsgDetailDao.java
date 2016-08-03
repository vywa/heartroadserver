package com.healthcloud.dao.message;

import com.healthcloud.domain.message.MsgDetail;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午1:54:32
* 消息详情数据访问层
*/
public interface MsgDetailDao {

	void add(MsgDetail msgDetail);
	
	MsgDetail findById(int id);
	
}
