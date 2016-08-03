package com.healthcloud.util.smack;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.chat.ChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterEntry;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smackx.iqregister.AccountManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.healthcloud.exception.im.OperationFailureException;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年5月16日 下午4:46:16
* 及时通信工具类
*/
public class SmackUtil {

	private  AbstractXMPPConnection connection=null;

	
	private static final Logger log = LoggerFactory.getLogger(SmackUtil.class);
	private static final String domain = "bob-optiplex-3020";
	
	public SmackUtil() {
		XMPPTCPConnectionConfiguration conifg = XMPPTCPConnectionConfiguration.builder().
				setServiceName(domain).setHost("localhost").setPort(5222).setDebuggerEnabled(true).
				setCompressionEnabled(false).setSecurityMode(SecurityMode.disabled).build();
		
		connection = new XMPPTCPConnection(conifg);
		try {
			connection.connect();
		} catch (SmackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//建立连接
	public  AbstractXMPPConnection connect(){

		try {
			connection.connect();
		} catch (SmackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	/*
	 *  是否连接成功
	 * */
	 private boolean isConnected() {
	    	if(connection == null) {
	    		return false;
	    	}
	    	if(!connection.isConnected()) {
	    	    try {
			connection.connect();
			return true;
		    } catch (SmackException | IOException | XMPPException e) {
			return false;
		    }
	    	}
	    	return true;
	    }
	
	
	
	/*
	 *  更改密码
	 * */
	public  void changePassword(String username, String password,String newPassword) 
	{ 
		
		try {
			//登陆
			connection.login(username,password,"healthServer");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SmackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AccountManager.sensitiveOperationOverInsecureConnectionDefault(true);  
        try {
			AccountManager.getInstance(connection).changePassword(newPassword);
			log.info("修改密码成功");
	
		} catch(Exception ex){
			throw new OperationFailureException("修改失败");
		}
        connection.disconnect();
	}
	
	/*
	 *  注册用户
	 * */
	 public boolean  regist(String username, String password) {
		 try {
			connection.login("admin","admin","healthServer");
		} catch (XMPPException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SmackException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		 
	    	if(!isConnected()) {
	    	    return false;
	    	}
	    	Map<String, String> attributes =new  HashMap<String,String>(); 
	    	attributes.put("healthServer", "healthServer");
	    
	    	try {
		    AccountManager.getInstance(connection).createAccount(username, password, attributes);
			connection.disconnect();
		    return true;
		} catch (NoResponseException | XMPPErrorException | NotConnectedException e) {
			log.info("注册失败");
		    return false;
		}
	    }

	
		/*
		 *  删除用户
		 * */
		 public boolean  deleteUser(String username, String password) {
			 try {
				connection.login(username,password,"healthServer");
				
			} catch (XMPPException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SmackException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
	    	if(!isConnected()) {
	    	    return false;
	    	}
		    	
		    try {
			    AccountManager.getInstance(connection).deleteAccount();
			    connection.disconnect();
			    return true;
			} catch (NoResponseException | XMPPErrorException | NotConnectedException e) {
				log.info("删除用户失败");
				 connection.disconnect();
			    return false;
			}
		    	  
	}

	
	/*
	 *  发送通知类
	 * */
	public  void notice(Message message) 
	{ 
		try {
			connection.login("admin","admin","healthServer");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			connection.sendPacket(message);
		} catch (NotConnectedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		disconnect();
	}
	
	
	/*
	 *  机器人应答
	 * */
	public void robotChat(String username){
		try {
			connection.login("admin", "admin","healthServer");
			Chat temp  = ChatManager.getInstanceFor(connection).createChat(username+"@"+domain);
		
			temp.addMessageListener(new ChatMessageListener(){

				@Override
				public void processMessage(Chat chat, Message message) {
					// TODO Auto-generated method stub
					try {
						chat.sendMessage("你刚才说的是"+message.getBody());
					} catch (NotConnectedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SmackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*
	 *  获取好友列表
	 * */
	public Set<RosterEntry> getRoster(String username,String password){
		try {
			connection.login(username , password ,"healthServer");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SmackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Set<RosterEntry> rosters = Roster.getInstanceFor(connection).getEntries();
		
		for(RosterEntry roster :rosters ){
			System.out.println("name: "+roster.getName()+",jid:"+roster.getUser());
		}
		connection.disconnect();
		return rosters;
	} 
	
	
	
	public void disconnect(){
		connection.disconnect();
	}
}
