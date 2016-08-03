package com.healthcloud.web.score;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.score.ScoreItem;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.service.score.ScoreItemService;



/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午11:02:29
* 积分项目控制器
*/
@RestController
@RequestMapping("scoreitem")
public class ScoreItemController {
	private static final Logger log = LoggerFactory.getLogger(ScoreItemController.class);
	
	@Resource
	private ScoreItemService scoreItemService;
	
	
	/*
	 * 
	 *  添加规则
	 * 
	 * */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	
	public ResponseResult<String> addPost(@RequestBody RequestContent<ScoreItem> data,HttpServletRequest request){
		ScoreItem subject = data.getData();
		scoreItemService.add(subject);
		 ResponseResult<String> result = new ResponseResult<String>();
		 result.setCode(206);
		 result.setMessage("添加规则成功");
		 return result;
	}

	
	
	/*
	 *  显示所有规则
	 * */
	@RequestMapping(value="/show",method=RequestMethod.POST)
	
	public ResponseResult<ScoreItem> showPost(@RequestBody RequestContent<Integer> data){
		 
		 int id = data.getData();
		 ScoreItem md = scoreItemService.find(id);
		 ResponseResult<ScoreItem> result = new ResponseResult<ScoreItem>();
		 result.setCode(206);
		 result.setContent(md);
		 result.setMessage("查询成功");
		 return result;
	}
	
	
	
	
	
	
}
