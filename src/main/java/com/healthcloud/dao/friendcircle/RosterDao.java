package com.healthcloud.dao.friendcircle;

import com.healthcloud.domain.friendcircle.Roster;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月23日 上午11:50:58
* 类说明
*/
public interface RosterDao {

	Roster getRoster(String username);
}
