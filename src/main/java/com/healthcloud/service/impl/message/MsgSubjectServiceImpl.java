package com.healthcloud.service.impl.message;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.message.MsgSubjectDao;
import com.healthcloud.domain.message.MsgSubject;
import com.healthcloud.service.message.MsgSubjectService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午1:48:58
* 消息摘要业务类
*/
@Service
public class MsgSubjectServiceImpl implements MsgSubjectService{

	@Resource
	private MsgSubjectDao msgSubjectDao;
	
	@Override
	public int add(MsgSubject msgSubject) {
		// TODO Auto-generated method stub
		msgSubjectDao.add(msgSubject);
		return 0;
	}

	@Override
	public MsgSubject find(int id) {
		// TODO Auto-generated method stub
		
		return msgSubjectDao.findById(id);
	}

	@Override
	public List<MsgSubject> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MsgSubject msgSubject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
