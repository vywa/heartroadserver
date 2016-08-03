package com.healthcloud.service.impl.account;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.healthcloud.dao.account.AccountDao;
import com.healthcloud.domain.account.Account;
import com.healthcloud.domain.account.Information;
import com.healthcloud.exception.account.AccountNotExistException;
import com.healthcloud.exception.account.AccountTypeException;
import com.healthcloud.exception.account.RegisterException;
import com.healthcloud.exception.account.UserPasswordException;
import com.healthcloud.service.account.AccountService;
import com.healthcloud.service.account.InformationService;
import com.healthcloud.util.smack.SmackUtil;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:04:59
* 账号业务实现类
*/
@Service
public class AccountServiceImpl implements AccountService{

	private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Resource
	private AccountDao accountDao;
	@Resource
	private InformationService informationService;
	
	@Override
	public Account getAccountById(int id) {
		// TODO Auto-generated method stub
		Account account = accountDao.queryById(id);
		if(account ==null){
			throw new AccountNotExistException();
		}
		return account;
	}


	@Override
	public int existUser(String sign, String type) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		int id = 0;
		switch(type){
		case "mobilephone":
			account.setMobilephone(sign);
			account= accountDao.queryOne(account);
			break;
		case "email":
			account.setEmail(sign);
			account = accountDao.queryOne(account);
			break;
		case "ussername":
			account.setUsername(sign);
			account = accountDao.queryOne(account);
			break;
	
		case "qq":
			account.setQq(sign);
			account =accountDao.queryOne(account);
			break;
		case "wechat":
			account.setQq(sign);
			account = accountDao.queryOne(account);
			break;
		case "webo":
			account.setWebo(sign);
			account = accountDao.queryOne(account);
			break;
			default:
				throw new AccountTypeException();
		}
		if(id == 0){
			throw new AccountNotExistException();
		}
		return id;
	}

	@Override
	public List<Account> getAccountALL() {
		// TODO Auto-generated method stub
		List<Account> list = accountDao.queryAll();
		return list;
	}


	@Override
	public void updatePassword(String password, int userId) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setPassword(password);
		account.setId(userId);
		accountDao.update(account);
	}

	/*
	 *  注册账号
	 * */
	@Override
	@Transactional
	public int registerAccount(Account account) {
		// TODO Auto-generated method stub
		//添加账号
		account.setCreateTime(new Date());
		account.setLastUpdateTime(new Date()); 										//更新添加时间
		 accountDao.add(account);
		 int id = account.getId();
		Information info = new Information();
		info.setUserId(id);
		info.setCreateTime(new Date());
		info.setModifyTime(new Date());
		//保存用户个人信息
		informationService.addInfo(info);
		SmackUtil temp = new SmackUtil();
		Boolean success = temp.regist(String.valueOf(id), account.getPassword());
		if(!success){
			throw new RegisterException();
		}
		return id;
	}

	@Override
	public void change(String type, String username, int userId) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setId(userId);
		switch(type){
		case "QQ":
			account.setQq(username);
			accountDao.update(account);
			break;
		case "wechat":
			account.setWechat(username);
			accountDao.update(account);
			break;
		case "webo":
			account.setWebo(username);
			accountDao.update(account);
			break;
		case "mobilephone":
			account.setMobilephone(username);
			accountDao.update(account);
			break;
		case "email":
			account.setEmail(username);
			accountDao.update(account);
			break;
		case "username":
			account.setUsername(username);
			accountDao.update(account);
			break;
		default:
			break;
		}
	
		
	
	
	}

	
	/*
	 * 	
	 * */
	@Override
	public int validateUser(String sign, String type, String password) {
		// TODO Auto-generated method stub
		
		Account account = new Account();
		account.setPassword(password);
		switch(type){
		case "username":
			account.setUsername(sign);
			account=accountDao.queryOne(account);
			break;
		case "email":
			account.setEmail(sign);
			account =accountDao.queryOne(account);
			break;
		case "mobilephone":
			account.setMobilephone(sign);
			account = accountDao.queryOne(account);
			break;
		case "qq":
			account.setQq(sign);
			account =accountDao.queryOne(account);
			break;
		case "wechat":
			account.setQq(sign);
			account = accountDao.queryOne(account);
			break;
		case "webo":
			account.setWebo(sign);
			account = accountDao.queryOne(account);
			break;
			default:
				throw new AccountTypeException();
		}
		
		if(account == null){
			throw new UserPasswordException();
		}
		return account.getId();
	}

	

	@Override
	public Account validateThirdUserBySign(String sign, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
