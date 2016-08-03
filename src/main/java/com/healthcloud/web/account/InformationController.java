package com.healthcloud.web.account;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.healthcloud.domain.account.Information;
import com.healthcloud.dto.RequestContent;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.dto.ResponseResult;
import com.healthcloud.service.account.InformationService;
import com.healthcloud.util.network.NetworkUtil;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 下午3:06:15
* 个人基本信息
*/
@RestController
@RequestMapping("info")
public class InformationController {

	private static final Logger log = LoggerFactory.getLogger(InformationController.class);
	private static final String LOCAL_STORAGE_PATH = "/home/bob/multimedia/download/";
	private static final String REMOTE_STORAGE_PATH = "/home/thealth/multimedia/download/";
	
	@Resource
	private InformationService informationService;
	/*
	 * 上传用户图像
	 * 
	 * */
    @RequestMapping(value="/upload",produces = "text/html;charset=UTF-8")  
   
    public ResponseResult<String> upload(@RequestParam MultipartFile image,HttpServletRequest request) throws IOException  {
    	
    	ResponseResult<String> result = new ResponseResult<String>();
    	
    	String ip = NetworkUtil.getPhysicalHostIP();
    	int userId = (int)request.getAttribute("userId");

	    String originalfilename = image.getOriginalFilename();
	    String filename = new Date().getTime()+originalfilename;

	    //存储图片
		 FileUtils.writeByteArrayToFile(new File(LOCAL_STORAGE_PATH,filename), image.getBytes());
		 //更新地址
		 informationService.updateUrl(userId, filename);
		
	   result.setCode(206);
	   result.setMessage("上传成功");
	   result.setContent(filename);
		 return result;
    }
    
	/*
	 * 
	 * 	更新个人信息
	 * 
	 * */
	@RequestMapping(value="/updateInfo",produces = "text/html;charset=UTF-8")
	
	public ResponseCode updateDoctorInfo(@RequestBody  RequestContent<Information> data){
		Information info = data.getData();
		//更新个人信息
		informationService.updateInfo(info);
		ResponseResult<String> result = new ResponseResult<String>();
		result.setCode(206);
		result.setMessage("更新信息成功");
		 return result;
	}
	
	
	
}
