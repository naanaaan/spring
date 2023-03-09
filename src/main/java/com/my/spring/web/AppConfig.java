package com.my.spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//handler에 등록한 ㅓㅋㄴ트롤러가 아니고 이건 viewController이다.
@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Value("${attachPath}") // application.properties 값 가져오는 방법
	private String attachPath;
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("ch01/main");
		registry.addViewController("ch02/ex03/user").setViewName("ch02/ex03/userIn");
		//viewController는 2순위고 handler는 1순위이다.
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("res/**").addResourceLocations("WEB-INF/res/");
		registry.addResourceHandler("attach/**").addResourceLocations("file:///" + attachPath + "/");
	}
	//처음에 dipatch거쳐서 view resolve거친후 주소보고 다시 요청을 하는데 그때 resource핸들러받고 defualt servlet에서 받음.
}
