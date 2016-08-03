package com.healthcloud.util.network;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月1日 上午9:38:02
* 类说明
*/
public class NetworkUtil {

	/** 
     * 获取本机所有IP 
     */  
	 public static String getPhysicalHostIP() {  
	        String res =null;
	        Enumeration netInterfaces;  
	        try {  
	            netInterfaces = NetworkInterface.getNetworkInterfaces();  
	            InetAddress ip = null;  
	            while (netInterfaces.hasMoreElements()) {  
	                NetworkInterface ni = (NetworkInterface) netInterfaces  
	                        .nextElement();  
	                if (ni.isLoopback() ) {
	                    continue;
	                }
	                if(ni.getName().equals("eth0")){
	                	  Enumeration nii = ni.getInetAddresses();  
	  	                while (nii.hasMoreElements()) {  
	  	                    ip = (InetAddress) nii.nextElement();             
	  	                       res = ip.getHostAddress();
	  	                    }  
	  	                }  
	             
	             
	            if(ni.getName().equals("eth1")){
              	  Enumeration nii = ni.getInetAddresses();  
	                while (nii.hasMoreElements()) {  
	                    ip = (InetAddress) nii.nextElement();             
	                       res = ip.getHostAddress();
	                    }  
	                break;
	                }  
              }
	            
	        } catch (SocketException e) {  
	            e.printStackTrace();  
	        }  
	     return res;
	    }  
	 
}
