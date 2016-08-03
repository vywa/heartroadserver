package com.healthcloud.service.impl.forum;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.forum.ReplySubjectDao;
import com.healthcloud.domain.forum.ReplySubject;
import com.healthcloud.service.forum.ReplySubjectService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午10:57:05
* 回复帖子
*/
@Service
public class ReplySubjectServiceImpl implements ReplySubjectService{

	@Resource
	private ReplySubjectDao replySubjectDao;
	
	@Override
	public void reply(ReplySubject reply) {
		// TODO Auto-generated method stub
		replySubjectDao.reply(reply);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		replySubjectDao.delete(id);
	}

	@Override
	public List<ReplySubject> querySubject(int subjectId, int start, int limit) {
		// TODO Auto-generated method stub
		return replySubjectDao.queryList(subjectId, start, limit);
	}

}
