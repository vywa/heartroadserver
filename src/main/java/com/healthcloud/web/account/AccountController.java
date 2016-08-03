package com.healthcloud.web.account;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthcloud.domain.account.Account;
import com.healthcloud.domain.message.Sms;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.dto.account.SmsReceive;
import com.healthcloud.service.account.AccountService;
import com.healthcloud.service.impl.message.SmsProducerServiceImpl;


/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:06:01
* 账号控制器
*/
@RestController
@RequestMapping("account")
public class AccountController {

	private static final Logger log = LoggerFactory.getLogger(AccountController.class);
	
	@Resource
	private AccountService accountService;
	
	@Resource
	private SmsProducerServiceImpl SmsProducerServiceImpl;
	/*
	 * 
	 * 短信发送验证码
	 * 
	 */
	@RequestMapping(value = "/smsSend")

	public ResponseCode smsSend(@RequestBody  RequestContent<String> data) {
		
		
		String mobile = data.getData();
		//手机号过滤逻辑,正确性检测
		Sms sms = new Sms();
		sms.setMobile(mobile);
		int codeNum = (int) (Math.random() * 10000);
		codeNum = codeNum > 1000 ? codeNum : codeNum + 1000;
		//registerCacheService.setConfirmCode(email, String.valueOf(codeNum));
		//registerCacheService.addTryCount(email);

		String content = "您本次注册时使用的验证码是" + codeNum + "如果非本人操作，请忽略。";

		//String to = email;
		//simpleMail.sendMail(subject, content, to);
		
		
		sms.setContent(content);
		SmsProducerServiceImpl.sendSms(sms);;
		ResponseResult<String> result = new ResponseResult<String>();
		result.setCode(206);
		result.setMessage("发送验证码成功");
		result.setContent(null);
		 return result;
	}
	
	/*
	 * 
	 * 短信接收注册
	 * 
	 */
	@RequestMapping(value = "/smsReceive")
	
	public ResponseCode smsReceive(@RequestBody  RequestContent<SmsReceive> data) {
		//获得参数
		String mobile = data.getData().getMobilephone();
		String code = data.getData().getCode();
		String password = data.getData().getPassword();
	
		ResponseResult result = new ResponseResult();
		 return result;
	}
	
	/*
	 * 邮箱发送验证码
	 * 
	 */
	@RequestMapping(value = "/mailSend")

	public ResponseCode mailSend(@RequestBody  RequestContent<String> data) {
		String email = data.getData();
		System.out.println("收到数据: "+email);
		ResponseResult<String> result = new ResponseResult<String>();
		result.setCode(206);
		result.setMessage("收到数据");
		result.setContent("ssss");
		 return result;
	}
	

	
	/*
	 * 
	 * 注册用户
	 * 
	 */
	@RequestMapping(value = "/register")
	public ResponseCode UserRegister(@RequestBody RequestContent<Account> data) {
	
		Account account = data.getData();
		System.out.println("手机号: "+account.getMobilephone()+"密码为: "+account.getPassword());
		int id = accountService.registerAccount(account);
		ResponseResult<String> result = new ResponseResult<String>();
		result.setCode(206);
		result.setMessage("注册成功");
		result.setContent("0");
		return result;
	}
	
	/*
	 * 查询账号
	 * 
	 */

	@RequestMapping(value = "/show")
	
	public ResponseCode findUserAccount() {
		ResponseResult result = new ResponseResult();
		 return result;
	}
	
	/*
	 * 
	 *  添加账号
	 * 
	 * */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	
	public ResponseCode addAccount(@RequestBody  RequestContent<Account> data,HttpServletRequest request){
		
		 ResponseResult result = new ResponseResult();
		 return result;
	}


	/*
	 * 邮箱重置密码
	 * 
	 */

	
	@RequestMapping(value = "/emailReset")
	public ResponseCode emailReset(@RequestParam String data) {
		ResponseResult result = new ResponseResult();
		 return result;
	}
	
	/*
	 * 重置密码
	 * 
	 */

	
	@RequestMapping(value = "/updatePassword")
	public ResponseCode updatePassword(@RequestParam String data) {
		ResponseResult result = new ResponseResult();
		 return result;
	}
	
	/*
	 * 在线修改密码
	 * 
	 */
	
	@RequestMapping(value = "/changePassword")
	public ResponseCode changePassword(@RequestParam String data, HttpServletRequest request) {
		ResponseResult result = new ResponseResult();
		 return result;
	}
	


	
	/*
	 * 
	 * 查询所有账号
	 * 
	 */
	
	@RequestMapping(value = "/all")
	public ResponseCode allUser(HttpServletRequest request) {
		ResponseResult result = new ResponseResult();
		 return result;
	}
	


}
