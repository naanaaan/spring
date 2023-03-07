package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller("ch02.ex02")
@RequestMapping("ch02/ex02/")//공통적인url
public class UserController {
	//데이터를 읽는다 get
	@GetMapping("userIn")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	//데이터를 추가한다 post
	//단순하게 servlet만 쓰면 STring으로만 쓰였는데 이건 알아서 타입변환시킴
	//날짜느 ㄴ형식써줘야함
//	@PostMapping("userOut")
//	public String userOut(@RequestParam String username,
//						@RequestParam int age,
//						@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
//						Model model) {
//		model.addAttribute("user", new User(username, age, regDate));
//		return "ch02/ex02/userOut";
//	}
	//requestparam은 기본값이 많이써서
	@PostMapping("userOut")
	public String userOut( String username,
						 int age,
						 @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
						Model model) {
		model.addAttribute("user", new User(username, age, regDate));
		return "ch02/ex02/userOut";
	}
}
