package com.healthcloud.domain.shopping;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 微信的配置参数
 * @author iYjrg_xiebin
 * @date 2015年11月25日下午4:19:57
 */
@SuppressWarnings("unused")
public class WeixinConfigUtils {

	private static final Log log = LogFactory.getLog(WeixinConfigUtils.class);


	public static String appid;
	public static String mch_id;
	public static String notify_url;

	static {
		/*ResourceBundle bundle = ResourceBundle.getBundle("resources/sys");
		appid = bundle.getString("appid");
		mch_id = bundle.getString("mch_id");
		notify_url = bundle.getString("notify_url");*/

		try{
			/*
			InputStream is = WeixinConfigUtils.class.getResourceAsStream("/resources/sys.properties");
			Properties properties = new Properties();
			properties.load(is);
			
			appid = properties.getProperty("appid");
			mch_id = properties.getProperty("mch_id");
			notify_url = properties.getProperty("notify_url");
			*/
			appid= "wxbeb7e0e79e4dd40f";
			mch_id="1362225902";
			notify_url="http://123.56.200.202/healthcloudserver/order/receive";
		}catch(Exception ex){
			log.debug("加载配置文件："+ex.getMessage());
		}
	}


	public static void main(String[] args) throws IOException {
		InputStream is = WeixinConfigUtils.class.getResourceAsStream("/resources/sys.properties");

		Properties properties = new Properties();

		properties.load(is);

		is.close();
		String appid = properties.getProperty("appid");
		System.out.println(appid);
	}

}
