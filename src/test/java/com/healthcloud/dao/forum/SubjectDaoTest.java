package com.healthcloud.dao.forum;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.healthcloud.SpringTest;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月24日 上午8:51:54
* 类说明
*/
public class SubjectDaoTest extends SpringTest{

	private static Logger log = LoggerFactory.getLogger(SubjectDaoTest.class);
	
	@Resource
	private SubjectDao subjectDao;
	
	
	@Test
	public void test() {
		/*
		Subject subject = new Subject();
		subject.setAuthorId(20014);
		subject.setTitle("happy");
		subject.setContent("每天快乐");
		subject.setPublishTime(new Date());
		subjectDao.add(subject);
		log.info("发布帖子成功");
		
		List<Subject> list = subjectDao.findSubjectByAuthor(20014);
		if(list != null) {
			for(Subject temp :list){
					log.info(temp.toString());
			}
		}
		*/
	}

}
