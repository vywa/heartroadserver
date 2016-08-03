package com.healthcloud.web.account;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.account.Resource;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.service.account.ResourceService;


/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:06:01
* 资源控制器
*/
@RestController
@RequestMapping("resource")
public class ResourceController {

	private static final Logger log = LoggerFactory.getLogger(ResourceController.class);
	
	@Inject
	private ResourceService resourceService;
	/*
	 * 
	 * 添加资源
	 * 
	 */
	@RequestMapping(value = "/add")
	public ResponseCode addRole(@RequestBody RequestContent<Resource> data) {
	
		Resource role = data.getData();
		resourceService.add(role);
		ResponseResult<String> result = new ResponseResult<String>();
		result.setCode(206);
		result.setMessage("资源添加成功");
		result.setContent("0");
		return result;
	}
	
	/*
	 *  查看所有资源
	 * */
	@RequestMapping(value = "/queryAll")
	public ResponseCode queryAll() {
		List<Resource> list = resourceService.queryAll();
		ResponseResult<List<Resource>> result = new ResponseResult<List<Resource>>();
		result.setCode(206);
		result.setMessage("查询资源成功");
		result.setContent(list);
		return result;
	}

	

}
