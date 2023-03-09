package com.my.spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/home")
public class NumController {
	@GetMapping("numIn") //@Nullable도 가능하긴함
	public String numIn() {
		return "ch02/home/numIn";
	}
	
	@GetMapping("numOut")
	public String numOut(Number num22) {   //변수명이아니라 Number필드값 num에 파라미터값이 들어가고 number라는 attribute생성
		return "ch02/home/numOut";
	}
}
/*
폼에 자연수 하나를 입력한다. 
폼을 제출한다.
입력값 <= x < 입력값 + 1인, x 를 출력한다.
x는 실수이다.
x는 랜덤값이다.
x는 소수점 이하 한자리까지 표현한다.
*/