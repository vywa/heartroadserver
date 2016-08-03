package com.healthcloud.dao.forum;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.healthcloud.SpringTest;
import com.healthcloud.domain.forum.ReplySubject;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月24日 上午11:51:27
* 类说明
*/
public class ReplySubjectDaoTest extends SpringTest{

	private static Logger log = LoggerFactory.getLogger(ReplySubjectDaoTest.class);
	
	@Resource
	private ReplySubjectDao replySubjectDao;
	
	@Test
	public void test() {
		ReplySubject reply = new ReplySubject();
	/*	
		reply.setUserId(20014);
		reply.setSubjectId(1);
		reply.setReplyTime(new Date());
		reply.setReplyContent("可爱");
	
		
		log.info("添加回复成功");
		List<ReplySubject> replyList = replySubjectDao.queryList(1);
		if(replyList != null){
			for(ReplySubject temp : replyList){
				log.info(temp.getUserId()+"");
			}
		}
		*/
	}

}
