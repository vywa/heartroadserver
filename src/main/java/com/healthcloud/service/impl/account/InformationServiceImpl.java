package com.healthcloud.service.impl.account;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.healthcloud.dao.account.InformationDao;
import com.healthcloud.domain.account.Information;
import com.healthcloud.service.account.InformationService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:03:52
* 个人信息类
*/
@Service
public class InformationServiceImpl implements InformationService{

	@Resource
	private InformationDao informationDao;
	

	@Override
	public void updateUrl(int id, String iconUrl) {
		// TODO Auto-generated method stub
		Information info = new Information();
		info.setUserId(id);
		info.setIconUrl(iconUrl);
		informationDao.updateInfo(info);
	}


	@Override
	public void addInfo(Information info) {
		// TODO Auto-generated method stub
		informationDao.addInfo(info);
	}


	@Override
	public void updateInfo(Information info) {
		// TODO Auto-generated method stub
		informationDao.updateInfo(info);
	}


	@Override
	public Information getInfoById(int id) {
		// TODO Auto-generated method stub
		return informationDao.getInfoById(id);
	}


	@Override
	public List<Information> getInfos(Information info) {
		// TODO Auto-generated method stub
		return informationDao.queryList(info);
	}


	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		informationDao.deleteById(id);
	}




}
