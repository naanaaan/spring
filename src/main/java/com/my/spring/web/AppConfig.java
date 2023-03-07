package com.my.spring.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//handler에 등록한 ㅓㅋㄴ트롤러가 아니고 이건 viewController이다.
@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("ch01/main");
		registry.addViewController("ch02/ex03/user").setViewName("ch02/ex03/userIn");
		//viewController는 2순위고 handler는 1순위이다.
	}
}
