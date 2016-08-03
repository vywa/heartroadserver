package com.healthcloud.service.impl.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.healthcloud.domain.message.Mail;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月12日 上午10:14:18
* 邮件监听器
*/

public class EmailMessageListener {

	private static final Logger log = LoggerFactory.getLogger(EmailMessageListener.class);

	
	private SimpleMail simpleMail;

	public void handleMessage(Mail mail) {
		// TODO Auto-generated method stub
			try {
				simpleMail.sendMail(mail.getSubject(), mail.getContent(), mail.getTo());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				log.error("发送失败");
			}
		
	}

	public SimpleMail getSimpleMail() {
		return simpleMail;
	}

	public void setSimpleMail(SimpleMail simpleMail) {
		this.simpleMail = simpleMail;
	}

}
