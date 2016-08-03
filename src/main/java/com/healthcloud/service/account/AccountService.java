package com.healthcloud.service.account;

import java.util.List;

import com.healthcloud.domain.account.Account;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:04:42
* 账号业务类
*/
public interface AccountService {

	//根据id查询账号
	public Account getAccountById(int id);
	
	
	//用户是否存在
	public int existUser(String sign,String type);
	
	//获取所有账号
	public List<Account> getAccountALL();
	

	//更改密码
	public void updatePassword(String password,int userId) ;

	//注册账号
	public int registerAccount(Account Account);
	
	//改变用户找好绑定信息
	public void change(String type,String username,int userId);
	

	
	//验证用户是否有效,返回用户userId
	
	public int validateUser(String sign, String type,String password) ;
	
	
	//验证第三方用户是否存在
	public Account validateThirdUserBySign(String sign, String type) ;
	
	
}
