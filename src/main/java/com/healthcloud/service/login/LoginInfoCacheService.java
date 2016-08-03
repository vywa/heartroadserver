package com.healthcloud.service.login;

/*
 *  用户登陆会话缓存
 * */
public interface LoginInfoCacheService {

	//添加登陆session信息
	public String login(String username, int userId);
	
	//退出登陆
	public void logout(int userId);
	
	//根据tocken获得用户id
	public int isOnline(String tocken);
	

}
