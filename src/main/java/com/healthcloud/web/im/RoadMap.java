package com.healthcloud.web.im;
/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年8月2日 下午3:08:16
*心路地图
*/
public class RoadMap {

	/*
	 *  主菜单
	 * */
	public static String getTranslateUsage() {  
        StringBuffer buffer = new StringBuffer();  
        // buffer.append(XiaoqUtil.emoji(0xe148)).append("Q译通使用指南").append("\n\n");  
        buffer.append("爱情心路总功能菜单").append("\n");  
        buffer.append("萍水相逢").append("\n");
        buffer.append("使用说明：24 姓名 性别 出生日期  出生地").append("\n");
        buffer.append("爱情驿站").append("\n");
        buffer.append("使用说明：24 姓名 性别 出生日期  出生地").append("\n");
        buffer.append("占卜").append("\n");  
        buffer.append("使用说明：如果未绑定个人资料，则提示24 绑定个人资料 ").append("\n");
        buffer.append("使用说明：21 心中最想的东西").append("\n");  
        buffer.append("指引迷津").append("\n");  
        buffer.append("使用说明：22 姓名 性别 出生日期 出生时间 ").append("\n");  
        buffer.append("自我提升").append("\n");  
        buffer.append("使用说明：如果未绑定个人资料，则提示24 绑定个人资料 ").append("\n");  
        buffer.append("使用说明：23  ").append("\n");  
        buffer.append("闻道寻美").append("\n");
        buffer.append("使用说明：24 姓名 性别 出生日期  出生地").append("\n");  
        buffer.append("奇术巧技").append("\n");
        buffer.append("使用说明：24 姓名 性别 出生日期  出生地").append("\n");  
        buffer.append("影子对话").append("\n");
        buffer.append("使用说明：24 姓名 性别 出生日期  出生地").append("\n"); 
        buffer.append("真正的我").append("\n");
        buffer.append("使用说明：24 姓名 性别 出生日期  出生地").append("\n"); 
    
        buffer.append("回复“?”显示主菜单");  
        return buffer.toString();  
    }  
}
