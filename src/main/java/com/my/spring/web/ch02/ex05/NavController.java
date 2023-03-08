package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
		return "forward:target"; //forward:붙이면 viewName이 아니라 url이된다.
		//ch02/ex05/target
	}
	
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target";
	}
	
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target"; //response에 담김 ch02/ex05/target으로 다시 감
	}
	
	@GetMapping("naver")
	public String naver() {
		return "redirect:https://naver.com"; //다른서버라서 redirect써야함
	}
	
}
