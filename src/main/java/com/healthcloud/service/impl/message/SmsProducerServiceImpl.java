package com.healthcloud.service.impl.message;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.healthcloud.domain.message.Sms;


@Service
public class SmsProducerServiceImpl {
	@Resource
	 private Destination smsQueue;   
	@Resource
	private JmsTemplate jmsTemplate;
	@Resource
	private SmsMessageConverter smsMessageConverter;

	
	public void sendSms(Sms sms) {
		// TODO Auto-generated method stub
		jmsTemplate.setMessageConverter(smsMessageConverter);
		jmsTemplate.setPubSubDomain(false);
		jmsTemplate.convertAndSend(smsQueue, sms);
	}
}
