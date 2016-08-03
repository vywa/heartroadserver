package com.healthcloud.service.impl.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.healthcloud.domain.message.Sms;
import com.healthcloud.util.sms.SubmitResult;
import com.healthcloud.util.sms.sender.SmsSender;

//短信发送处理类

public class SmsListener {

	private static final Logger log = LoggerFactory.getLogger(SmsListener.class);
	
	
//	private RegisterCacheService registerCacheService;
	
	//发送短信
	public void handleMessage(Sms sms) {   
		
			int codeNum = (int)(Math.random()*10000);
			codeNum = codeNum>1000?codeNum:codeNum+1000;
			//存储在缓存内
//			registerCacheService.setConfirmCode("mobilephone", String.valueOf(codeNum));
			SubmitResult result;
			
			SmsSender smsSender = new SmsSender(sms.getMobile(),codeNum);
			
			result =  smsSender.send();
	}
}
