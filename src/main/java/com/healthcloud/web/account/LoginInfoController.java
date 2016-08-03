package com.healthcloud.web.account;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.account.LoginInfo;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.dto.account.LoginResult;
import com.healthcloud.exception.account.UserPasswordException;
import com.healthcloud.service.account.AccountService;
import com.healthcloud.service.login.LoginInfoCacheService;
import com.healthcloud.util.regex.Validator;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月28日 下午2:37:04
* 登陆类
*/
@RestController
@RequestMapping("reglog")
public class LoginInfoController {

	private static final Logger log = LoggerFactory.getLogger(LoginInfoController.class);
	
	@Resource 
	private LoginInfoCacheService loginInfoCacheService;
	
	@Resource
	private AccountService accountService;
	/*
	 *  用户名账号登陆
	 * */
	@RequestMapping(value="/username")
	public ResponseCode loginByUsername(@RequestBody  RequestContent<LoginInfo> data,HttpServletRequest request) {
		LoginInfo login = data.getData();
		String type = Validator.type(login.getUsername());
		LoginResult loginResult;
		ResponseResult<LoginResult> result = new ResponseResult<LoginResult>();
		try {
			int id = accountService.validateUser(login.getUsername(), type, login.getPassword());
			String tocken =loginInfoCacheService.login(login.getUsername(), id);
			result.setCode(206);
			result.setMessage("登陆成功"); 
			 loginResult = new LoginResult();
			loginResult.setTocken(tocken);
			loginResult.setUserId(id);;
			result.setContent(loginResult);
			return result;
		} catch (UserPasswordException e) {
			// TODO Auto-generated catch block
			result.setCode(110);
			result.setMessage("用户名或密码错误");
			
			 return result;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			result.setCode(110);
			result.setMessage("登陆失败");
			 return result;
		}
	
	}
	

	
	/*
	 * 
	 *  验证tocken有效性
	 * 
	 */
	@RequestMapping(value="/fresh",produces = "text/html;charset=UTF-8")
	public ResponseCode freshToken(HttpServletRequest request) {
	
		
		ResponseResult<LoginResult> result = new ResponseResult<LoginResult>();
		int userId = (int)request.getAttribute("userId");
		if(userId==-1){
			result.setCode(110);
			result.setMessage("tocken失效");
			return result;
		}
		result.setCode(206);
		result.setMessage("登陆成功"); 
		return result;
	}
	
	

	/*
	 * 通过第三方登陆
	 * 
	 */
	@RequestMapping(value="/thirdPart",produces = "text/html;charset=UTF-8")
	
	public ResponseCode loginByThirdPart(@RequestParam String data,HttpServletRequest request) {
		ResponseResult result = new ResponseResult();
		 return result;
	}

	/*
	 * 退出登陆
	 * 
	 */
	@RequestMapping(value="/logout",produces = "text/html;charset=UTF-8")
	
	public ResponseCode logout(HttpServletRequest request) {
		ResponseResult<LoginResult> result = new ResponseResult<LoginResult>();
		int userId = (int)request.getAttribute("userId");
		if(userId==-1){
			result.setCode(110);
			result.setMessage("tocken失效");
			return result;
		}
		loginInfoCacheService.logout(userId);
		result.setCode(206);
		result.setMessage("退出成功"); 
		return result;
	}
	
	
}
