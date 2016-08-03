package com.healthcloud.web.forum;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.forum.Subject;
import com.healthcloud.dto.BaseRequest;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.dto.forum.SubjectResult;
import com.healthcloud.service.forum.SubjectService;



/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午11:02:29
* 帖子控制器
*/
@RestController
@RequestMapping("subject")
public class SubjectController {
	private static final Logger log = LoggerFactory.getLogger(SubjectController.class);
	
	@Resource
	private SubjectService subjectService;
	/*
	 * 
	 *  发送帖子
	 * 
	 * */
	@RequestMapping(value="/add",produces = "text/html;charset=UTF-8",method = RequestMethod.POST)
	
	public ResponseResult<String> addPost(@RequestBody RequestContent<Subject> data,HttpServletRequest request){
		Subject subject = data.getData();
		subjectService.add(subject);
		 ResponseResult<String> result = new ResponseResult<String>();
		 result.setCode(206);
		 result.setMessage("发送帖子成功");
		 return result;
	}

	/*
	 * 
	 *  帖子点赞
	 * 
	 * */
	@RequestMapping(value="/like",produces = "text/html;charset=UTF-8" ,method=RequestMethod.PUT)
	
	public  ResponseCode like(@RequestBody RequestContent<Integer> data,HttpServletRequest request){
		int userId =(int) request.getAttribute("userId");
		int id = data.getData();
		subjectService.like(id, userId);
		ResponseCode result = new ResponseCode(); 
		result.setCode(206);
		result.setMessage("点赞成功");
		 return result;
	}
	
	
	/*
	 *  显示所有帖子
	 * */
	@RequestMapping(value="/show",produces = "text/html;charset=UTF-8",method=RequestMethod.POST)
	
	public ResponseResult<List<SubjectResult>> showPost(@RequestBody BaseRequest request){
		 ResponseResult result = new ResponseResult(); 
		 return result;
	}
	
	
	/*
	 * 条件查询帖子列表
	 * */
	@RequestMapping(value="/queryList",produces = "text/html;charset=UTF-8")
	
	public ResponseCode queryList(@RequestParam String data,HttpServletRequest request){
		 ResponseResult result = new ResponseResult(); 
		 return result;
	}
	
	
	/*
	 * 删除id对应的帖子
	 * 
	 * */
	@RequestMapping(value="/delete",produces = "text/html;charset=UTF-8",method=RequestMethod.POST)
	
	public ResponseCode deletePost(@RequestBody RequestContent<Integer> data){
		 ResponseResult result = new ResponseResult(); 
		 return result;
	}
	
	
	/*
	 * 加精帖子
	 * 
	 * */
	@RequestMapping(value="/perfect",produces = "text/html;charset=UTF-8")
	
	public ResponseCode perfect(@RequestBody RequestContent<Integer> data){
		 ResponseResult result = new ResponseResult(); 
		 return result;
	}
	
	
	/*
	 * 查询精华帖子列表
	 * 
	 * */
	
	@RequestMapping(value="/perfectList",produces = "text/html;charset=UTF-8")
	
	public ResponseCode perfectList(@RequestParam String data){
		 ResponseResult result = new ResponseResult(); 
		 return result;
	}
	
	
	/*
	 * 查询我的帖子列表
	 * 
	 * */
	
	@RequestMapping(value="/selfSubject",produces = "text/html;charset=UTF-8")
	
	public ResponseCode selfSubject(@RequestParam String data,HttpServletRequest request){
		 ResponseResult result = new ResponseResult(); 
		 return result;
	}
	
	
	/*
	 * 查询我的收藏帖子列表
	 * 
	 * */
	@RequestMapping(value="/details",produces = "text/html;charset=UTF-8")
	
	public ResponseCode details(HttpServletRequest request){
		 ResponseResult result = new ResponseResult(); 
		 return result;
	}
	
}
