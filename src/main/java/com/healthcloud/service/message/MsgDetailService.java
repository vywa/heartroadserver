package com.healthcloud.service.message;

import java.util.List;

import com.healthcloud.domain.message.MsgDetail;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午1:44:25
* 消息详情
*/
public interface MsgDetailService {

	//添加消息详情
			int add(MsgDetail msgDetail);
			
			//查询消息详情
			MsgDetail find(int id);
			
			//查询所有消息详情
			List<MsgDetail> queryAll();
			
			//更新消息详情
			void update(MsgDetail msgSubject);
			
			//删除消息详情
			void delete(int id);
}
