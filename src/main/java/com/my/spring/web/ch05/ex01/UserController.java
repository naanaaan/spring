package com.my.spring.web.ch05.ex01;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.web.ch05.domain.User;

//json으로 반환하는 컨트롤러 어노테이션
@RestController("ch05.ex01") 
@RequestMapping("ch05/ex01")
public class UserController {
	@GetMapping("main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch05/ex01/main");
		return mv;
	}
	//json으로 반환해서 보냄 requset response 다 json임
	@GetMapping("get")
	public User get(User user) {
		return user;
	}
	//requestParam이아니라 Body임
	@PostMapping("post")
	public User post(@RequestBody User user) {
		return user;
	}
	//통쨰로 수정
	@PutMapping("put")
	public User put(@RequestBody User user) {
		return user;
	}
	//부분 수정
	@PatchMapping("patch")
	public User path(@RequestBody User user) {
		return user;
	}
	
	@DeleteMapping("delete")
	public User delete(@RequestBody User user) {
		return user;
	}
}
