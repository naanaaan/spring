package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller("ch02.ex03")
@RequestMapping("ch02/ex03/user")
public class UserController {
	//url따로지정 안해서 위에 requestMapping의 url됨
	@GetMapping
	public String userIn() {
		return "ch02/ex03/userIn";
	}
	
	//이건 post ch02/ex03/user이다.
	@PostMapping
	public String userOut(User user) {
		return "ch02/ex03/userOut";
	}
}
