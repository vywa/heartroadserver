package com.healthcloud.web.account;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.account.Role;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.service.account.RoleService;


/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:06:01
* 角色控制器
*/
@RestController
@RequestMapping("role")
public class RoleController {

	private static final Logger log = LoggerFactory.getLogger(RoleController.class);
	
	@Resource
	private RoleService roleService;

	
	/*
	 * 
	 * 添加角色
	 * 
	 */
	@RequestMapping(value = "/add")
	public ResponseCode addRole(@RequestBody RequestContent<Role> data) {
	
		Role role = data.getData();
		roleService.add(role);
		ResponseResult<String> result = new ResponseResult<String>();
		result.setCode(206);
		result.setMessage("角色添加成功");
		result.setContent("0");
		return result;
	}
	
	@RequestMapping(value = "/queryAll")
	public ResponseCode queryAll() {
	
		
		List<Role> list = roleService.findAll();
		ResponseResult<List<Role>> result = new ResponseResult<List<Role>>();
		result.setCode(206);
		result.setMessage("角色添加成功");
		result.setContent(list);
		return result;
	}


}
