package com.yzh.market.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

 
@Component
public class LogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	String origin = request.getHeader("Origin");
        if(origin==null||origin.equals("")){
            return true;
        }
        //非简单请求需要预请求，有json有cookie都是非简单请求
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "content-type");
    	String methods= request.getMethod().toUpperCase();
    	HttpSession session = request.getSession();
    	if("OPTIONS".equals(methods)) {
    		return true;
    	}
    	if(session != null & session.getAttribute("user") != null) {
    		return true;
    	}else {
    		response.setStatus(HttpStatus.FORBIDDEN.value());
        	return false;
    	}
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }
}
