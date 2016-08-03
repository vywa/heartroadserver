package com.healthcloud.web.im;

import org.weixin4j.message.output.TextOutputMessage;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年8月2日 上午11:01:56
* 输入处理类
*/
public class TextHandler {

	public static Object handle(String content){
		TextOutputMessage textMessage = new TextOutputMessage();  
		//翻译
		  if(content.startsWith("翻译")){
			  
	          	String keyword = content.replaceAll("^翻译", "").trim();
	          	if("".equals(keyword)){
	          		textMessage.setContent(BaudiTranslate.getTranslateUsage());
	          	} else {
	          		try {
						textMessage.setContent(BaudiTranslate.translate(keyword, "zh", "en"));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						textMessage.setContent("输入不合法");
					}
	          	}
	          	return textMessage;
		  }
		 else if(content.startsWith("算命")){				//六爻八卦，生辰八字，星座，地址（调用天气）
			 textMessage.setContent(BaudiTranslate.getTranslateUsage());
		}else if(content.startsWith("解惑")){				//问题类型，选择，通用解决方案（模型）
				 textMessage.setContent(BaudiTranslate.getTranslateUsage());
		}else if(content.startsWith("自测")){				//做题等级，得分（排行榜，积分，好友推荐随机）,
					 textMessage.setContent(BaudiTranslate.getTranslateUsage());
		}else if(content.startsWith("世间百态")){	//快乐，成功，宗教，哲理，科学，艺术，经济，伦理
					 textMessage.setContent(BaudiTranslate.getTranslateUsage());
		}
		else if(content.startsWith("生活常识")){	//分门别类
			 textMessage.setContent(BaudiTranslate.getTranslateUsage());
		}
		else if(content.startsWith("心理测试")){	//
			 textMessage.setContent(BaudiTranslate.getTranslateUsage());
		}
		else if(content.startsWith("情感")){	//推荐心语，节日推荐
			 textMessage.setContent(BaudiTranslate.getTranslateUsage());
		}else if(content.startsWith("漂流瓶")){	//四人一组，看谁是诸葛亮，随机飘(推荐学习资料，从新战斗),按照选前设置的兴趣推荐，（排行榜，积分，好友推荐随机）
			 textMessage.setContent(BaudiTranslate.getTranslateUsage());
		}
		 else {
				
			}
		return null;
	}
}
