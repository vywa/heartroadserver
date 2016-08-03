package com.healthcloud.web.forum;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.forum.ReplySubject;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.service.forum.ReplySubjectService;



/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午11:02:29
* 回复帖子控制器
*/
@RestController
@RequestMapping("replysubject")  
public class ReplySubjectController {
	private static final Logger log = LoggerFactory.getLogger(ReplySubjectController.class);
	
	@Resource
	private ReplySubjectService replySubjectService;
	/*
	 * 
	 *  发表回复
	 * 
	 * */
	@RequestMapping(value="/add",produces = "text/html;charset=UTF-8",method = RequestMethod.POST)
	
	public ResponseCode reply(@RequestBody RequestContent<ReplySubject> data,HttpServletRequest request){
		ReplySubject replySubject = data.getData();
		replySubjectService.reply(replySubject);
		ResponseCode result = new ResponseCode();
		result.setCode(206);
		result.setMessage("回复帖子成功");
		 return result;
	}
	

	/*
	 * 删除id对应的回复
	 * 
	 * */
	@RequestMapping(value="/delete",produces = "text/html;charset=UTF-8",method=RequestMethod.POST)
	
	public ResponseCode deleteReply(@RequestBody RequestContent<Integer> data){
		int id = data.getData();
		replySubjectService.delete(id);
		ResponseCode result = new ResponseCode(); 
		result.setCode(206);
		result.setMessage("删除对应的回复");
		 return result;
	}

	
}
