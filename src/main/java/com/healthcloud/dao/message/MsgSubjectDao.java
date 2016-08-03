package com.healthcloud.dao.message;

import com.healthcloud.domain.message.MsgSubject;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午1:54:12
* 消息摘要数据访问层
*/
public interface MsgSubjectDao {

	void add(MsgSubject msgSubject);
	
	MsgSubject findById(int id);
}
