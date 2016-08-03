package com.healthcloud.service.impl.login;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.healthcloud.dao.RedisClientTemplate;
import com.healthcloud.exception.login.LoginCacheException;
import com.healthcloud.service.login.LoginInfoCacheService;
import com.healthcloud.util.encrypt.MD5Util;


/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月25日 下午3:33:34
* 登陆缓存操作类
*/

	@Service
	public class LoginInfoCacheServiceImpl implements LoginInfoCacheService{

		private static final Logger log = LoggerFactory.getLogger(LoginInfoCacheServiceImpl.class);
		
		@Resource
		private RedisClientTemplate redisClientTemplate;
		
	
		
		//登陆session的前缀
		private static final String loginPrefix = "login_";
		
		/*
		 *  添加登陆session信息
		 * */
		@Override
		public String  login(String username, int userId) {
			// TODO Auto-generated method stub
			Map<String,String> map = new HashMap<String,String>();
			Date date = new Date();
			long time = date.getTime();
			String tocken = username+userId+time;
			tocken = MD5Util.string2MD5(tocken);
			String oldTocken = redisClientTemplate.hget(loginPrefix+userId, "tocken");
			
			if(oldTocken!=null){
				//销毁旧的tocken
				redisClientTemplate.expire(oldTocken, 0);
				}
			//设置新tocken
			redisClientTemplate.hset(loginPrefix+userId, "tocken", tocken);
			//设置tocken－－id 关系
			redisClientTemplate.set(tocken, String.valueOf(userId));
			return tocken;
		}
		
		@Override
		public void logout(int userId) {
			// TODO Auto-generated method stub
			String tocken = getTockenById(userId);
			redisClientTemplate.hdel(loginPrefix+userId, "tocken");
			redisClientTemplate.expire(tocken, 0);
		}
		
		/*
		 *  该tocken对应用户是否在线
		 * */
		public boolean valideSession(String tocken) {
			// TODO Auto-generated method stub
			return redisClientTemplate.exists( tocken);
		}
		
		/*
		 *  根据用户tocken获取用户id
		 * */
		public int getUserId(String tocken) {
			// TODO Auto-generated method stub
			String idStr;
			try {
				idStr = redisClientTemplate.get( tocken);
				if(idStr == null){
					return -1;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return -1;
			}
			return Integer.valueOf(idStr);
		}
		

		/*
		 *  通过id 获取tocken
		 * */
		public String getTockenById(int id){
			String tocken=null;
			try {
				 tocken = redisClientTemplate.hget(loginPrefix+id, "tocken");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new LoginCacheException();
			}
			return tocken;
		}

	


		@Override
		public int isOnline(String tocken) {
			// TODO Auto-generated method stub
			String status=null;
			try {
				status= redisClientTemplate.get(tocken);
				int userId = Integer.valueOf(status.replace(loginPrefix, ""));
				return userId;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return -1;
			}
			

		}

	
		
}
