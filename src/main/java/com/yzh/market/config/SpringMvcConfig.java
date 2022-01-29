package com.yzh.market.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.yzh.market.interceptor.LogInterceptor;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer{

	@Resource
	private LogInterceptor logInterceptor;
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(logInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns(
						"/login",
						"/area/list",
						"/type/list",
						"/message/getTopList",
						"/salesType/list",
						"/type/getRecommendList",
						"/images/**",
						"/user/upload"
						);
	}
}
