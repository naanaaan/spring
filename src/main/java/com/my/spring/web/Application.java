package com.my.spring.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.my.spring.web.**.dao.map") //매퍼위치알려주기
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
