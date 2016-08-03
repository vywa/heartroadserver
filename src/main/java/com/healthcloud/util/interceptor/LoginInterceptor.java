package com.healthcloud.util.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.healthcloud.dto.ResponseCode;
import com.healthcloud.service.login.LoginInfoCacheService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年2月22日 上午11:18:15
* 登陆拦截器，判断是否登陆
*/
public class LoginInterceptor implements HandlerInterceptor {

	private final Logger log = LoggerFactory.getLogger(LoginInterceptor.class);  
	
	@Resource
	private LoginInfoCacheService loginInfoCacheService;
	
	
	private String[] allowUrls;							//不拦截的资源
	
	public String[] getAllowUrls() {
		return allowUrls;
	}

	public void setAllowUrls(String[] allowUrls) {
		this.allowUrls = allowUrls;
	}

	//查看是否登陆，登陆成功，则访问原始页面
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String requstUrl = request.getRequestURI().replace(request.getContextPath(), "");
		
		if(null!=allowUrls ){
			for(String url : allowUrls){
				if(requstUrl.contains(url)){
					return true;
				}
			}
		}
		
		String tocken = request.getParameter("tocken");
		int loginUserId = loginInfoCacheService.isOnline(tocken);
		//登陆成功，访问下一个拦截器
		if(loginUserId>0){
			//设置查询者的userId
			int userId = loginUserId;
			//将请求者userId设置进请求
			request.setAttribute("userId", userId);
			//使用url
			String requestUrl = request.getServletPath();
			log.info("当前请求的地址是: "+requestUrl+",用户是: "+userId);
			//对url权限控制
			
			if(true){				//有权限
				return true;
			} else {		//无权限
				ResponseCode responseCode = new ResponseCode();
				responseCode.setCode(109);
				responseCode.setMessage("用户没有访问权限");
				response.setHeader("Content-type", "text/html;charset=UTF-8");		//浏览器用utf-8解析数据 
				response.setCharacterEncoding("UTF-8");			//servlet用utf转码
				response.getWriter().println(JSON.toJSONString(responseCode));
				return false;
			}
			
		} else {
	
		ResponseCode responseCode = new ResponseCode();
		responseCode.setCode(109);
		responseCode.setMessage("用户未登录");
		response.setHeader("Content-type", "text/html;charset=UTF-8");		//浏览器用utf-8解析数据 
		response.setCharacterEncoding("UTF-8");			//servlet用utf转码
		response.getWriter().println(JSON.toJSONString(responseCode));
		return false;
		}
	}

	@Override
	@ResponseBody
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
