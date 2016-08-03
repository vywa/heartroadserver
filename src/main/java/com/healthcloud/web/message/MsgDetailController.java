package com.healthcloud.web.message;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.message.MsgDetail;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.service.message.MsgDetailService;



/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午11:02:29
* 消息详情控制器
*/
@RestController
@RequestMapping("msgdetail")
public class MsgDetailController {
	private static final Logger log = LoggerFactory.getLogger(MsgDetailController.class);
	
	@Resource
	private MsgDetailService msgDetailService;
	/*
	 * 
	 *  发送帖子
	 * 
	 * */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	
	public ResponseResult<String> addPost(@RequestBody RequestContent<MsgDetail> data,HttpServletRequest request){
		MsgDetail subject = data.getData();
		msgDetailService.add(subject);
		 ResponseResult<String> result = new ResponseResult<String>();
		 result.setCode(206);
		 result.setMessage("添加消息成功");
		 return result;
	}

	
	
	/*
	 *  显示所有帖子
	 * */
	@RequestMapping(value="/show",method=RequestMethod.POST)
	
	public ResponseResult<MsgDetail> showPost(@RequestBody RequestContent<Integer> data){
		 
		 int id = data.getData();
		 MsgDetail md = msgDetailService.find(id);
		 ResponseResult<MsgDetail> result = new ResponseResult<MsgDetail>();
		 result.setCode(206);
		 result.setContent(md);
		 result.setMessage("查询成功");
		 return result;
	}
	
	
	
	
	
	
}
