package com.healthcloud.web.message;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.message.MsgSubject;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.service.message.MsgSubjectService;



/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午11:02:29
* 消息摘要控制器
*/
@RestController
@RequestMapping("msgsubject")
public class MsgSubjectController {
	private static final Logger log = LoggerFactory.getLogger(MsgSubjectController.class);
	
	@Resource
	private MsgSubjectService msgSubjectService;
	/*
	 * 
	 *  添加
	 * 
	 * */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	
	public ResponseResult<String> addPost(@RequestBody RequestContent<MsgSubject> data,HttpServletRequest request){
		MsgSubject subject = data.getData();
		msgSubjectService.add(subject);
		 ResponseResult<String> result = new ResponseResult<String>();
		 result.setCode(206);
		 result.setMessage("添加摘要成功");
		 return result;
	}

	/*
	 *  显示所有帖子
	 * */
	@RequestMapping(value="/show",method=RequestMethod.POST)
	
	public ResponseResult<MsgSubject> showPost(@RequestBody RequestContent<Integer> data){
		int id = data.getData();
		MsgSubject msgSubject = msgSubjectService.find(id);
		 ResponseResult<MsgSubject> result = new ResponseResult<MsgSubject>();
		 result.setCode(206);
		 result.setMessage("查询成功");
		 if(msgSubject!=null){
			 result.setContent(msgSubject);
		 }
		 return result;
	}
	
	
}
