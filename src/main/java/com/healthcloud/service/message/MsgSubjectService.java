package com.healthcloud.service.message;

import java.util.List;

import com.healthcloud.domain.message.MsgSubject;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午1:44:07
* 消息摘要
*/
public interface MsgSubjectService {

	//添加消息摘要
		int add(MsgSubject msgSubject);
		

		//查询消息摘要
		MsgSubject find(int id);
		
		//查询所有消息摘要
		List<MsgSubject> queryAll();
		
		//更新消息摘要
		void update(MsgSubject msgSubject);
		
		//删除消息摘要
		void delete(int id);
}
