package com.healthcloud.web.rank;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.rank.RankList;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.service.rank.RankListService;



/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午11:02:29
* 排行榜控制器
*/
@RestController
@RequestMapping("ranklist")
public class RankListController {
	private static final Logger log = LoggerFactory.getLogger(RankListController.class);
	
	@Resource
	private RankListService rankListService;
	
	
	/*
	 * 
	 *  添加规则
	 * 
	 * */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	
	public ResponseResult<String> addPost(@RequestBody RequestContent<RankList> data,HttpServletRequest request){
		RankList subject = data.getData();
		rankListService.add(subject);
		 ResponseResult<String> result = new ResponseResult<String>();
		 result.setCode(206);
		 result.setMessage("添加规则成功");
		 return result;
	}

	
	
	/*
	 *  显示所有规则
	 * */
	@RequestMapping(value="/show",method=RequestMethod.POST)
	
	public ResponseResult<RankList> showPost(@RequestBody RequestContent<Integer> data){
		 
		 int id = data.getData();
		 RankList md = rankListService.find(id);
		 ResponseResult<RankList> result = new ResponseResult<RankList>();
		 result.setCode(206);
		 result.setContent(md);
		 result.setMessage("查询成功");
		 return result;
	}
	
	
	
	
	
	
}
