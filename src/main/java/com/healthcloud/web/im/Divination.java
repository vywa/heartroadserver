package com.healthcloud.web.im;
/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年8月2日 下午2:49:17
* 占卜2号功能
*/
public class Divination {
	
	public static String getTranslateUsage() {  
        StringBuffer buffer = new StringBuffer();  
        // buffer.append(XiaoqUtil.emoji(0xe148)).append("Q译通使用指南").append("\n\n");  
        buffer.append("占卜专题，提供用户自助占卜功能").append("\n");  
        buffer.append("六爻八卦").append("\n");  
        buffer.append("使用说明：如果未绑定个人资料，则提示24 绑定个人资料 ").append("\n");
        buffer.append("使用说明：21 心中最想的东西").append("\n");  
        buffer.append("生辰八字").append("\n");  
        buffer.append("使用说明：22 姓名 性别 出生日期 出生时间 ").append("\n");  
        buffer.append("星座配对").append("\n");  
        buffer.append("使用说明：如果未绑定个人资料，则提示24 绑定个人资料 ").append("\n");  
        buffer.append("使用说明：23  ").append("\n");  
        buffer.append("完善资料").append("\n");
        buffer.append("使用说明：24 姓名 性别 出生日期  出生地").append("\n");  
        buffer.append("回复“?”显示主菜单");  
        return buffer.toString();  
    }  
}
