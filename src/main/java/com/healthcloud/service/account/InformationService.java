package com.healthcloud.service.account;

import java.util.List;

import com.healthcloud.domain.account.Information;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:03:27
* 类说明
*/
public interface InformationService {

	//添加某人信息
	void addInfo(Information info);

	//更新某人信息
		void updateInfo(Information info);

	//更新图片地址
	void updateUrl(int id,String iconUrl);


	//获取某个id的资料
	Information getInfoById(int id);
	
	//获取信息列表
	List<Information> getInfos(Information info);
	
	//删除某人信息
	void deleteById(int id);
}
