package com.my.spring.web.ch02.ex04;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ch02/ex04")
public class CheckController {
	@GetMapping
	public String main() {
		return "ch02/ex04/main";
	}
	
	@GetMapping("choice")
	public String choice(int kind) {
		String view = "ch02/ex04/";
		
		switch(kind) {
		case 1: view += "radioIn"; break;
		case 2: view += "checkboxIn";
		}
		return view;
	}
	//모델네임 자동붙을려면 커맨드객체여야함
	/*
	@PostMapping("radio")
	public String radio(String agree, Model model) {
		model.addAttribute("agree", agree);
		return "ch02/ex04/radioOut";
	}
	*/
	@PostMapping("radio")
	public String radio(@ModelAttribute("agree")String agree) {
		return "ch02/ex04/radioOut";
	}
	//순수 String @RequestParam생략가능했지만 ArrayList라 생략안됨
	@PostMapping("checkbox")
	public String checkbox(@RequestParam("fruit") ArrayList<String> fruits, Model model) {
		model.addAttribute("fruits", fruits);
		return "ch02/ex04/checkboxOut";
	}
}
