package com.healthcloud.service.impl.message;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailReceiveQueueListener implements MessageListener{

	private static final Logger log = LoggerFactory.getLogger(EmailReceiveQueueListener.class);
	
	@Resource
	private MailMessageConverter mailMessageConverter;
	
	

	@Override
	public void onMessage(Message message) {

		if(message instanceof TextMessage){
			TextMessage textMessage = (TextMessage)message;
			
			try {
				
				if(textMessage.getText().equalsIgnoreCase("success")){
					System.out.println("邮件发送成功");
				}
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
