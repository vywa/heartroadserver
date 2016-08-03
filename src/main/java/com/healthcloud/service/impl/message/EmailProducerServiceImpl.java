package com.healthcloud.service.impl.message;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.healthcloud.domain.message.Mail;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月12日 上午10:38:57
* 邮件发送业务类
*/
@Service
public class EmailProducerServiceImpl {

	@Resource
	private JmsTemplate jmsTemplate;
	
	@Resource
	private Destination emailQueue;
	
	@Resource
	private MailMessageConverter mailMessageConverter;

	
	public void sendEmail(Mail mail) {
		// TODO Auto-generated method stub
		jmsTemplate.setMessageConverter(mailMessageConverter);
		jmsTemplate.setPubSubDomain(false);
		jmsTemplate.convertAndSend(emailQueue, mail);
	}
	
	
}
