package com.healthcloud.service.impl.message;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQObjectMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import com.healthcloud.domain.message.Sms;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月12日 下午1:43:12
* 类说明
*/
@Component
public class SmsMessageConverter implements MessageConverter{

	private static final Logger log = LoggerFactory.getLogger(SmsMessageConverter.class);
	
	
	@Override
	public Object fromMessage(Message message) throws JMSException, MessageConversionException {
		// TODO Auto-generated method stub
		ActiveMQObjectMessage amsg = (ActiveMQObjectMessage) message;
		try {
			Sms sms = (Sms) amsg.getObject();
			return sms;
		} catch (Exception e) {
			log.error("Message:${} 类型不正确." + message.toString());
			throw new JMSException("Message:[" + message + "] 类型不正确");
		}

	}

	@Override
	public Message toMessage(Object obj, Session session) throws JMSException, MessageConversionException {
		// TODO Auto-generated method stub
		ActiveMQObjectMessage msg = (ActiveMQObjectMessage) session.createObjectMessage();
		msg.setObject((Sms) obj);
		return msg;
	}

}
