package com.my.spring.web.ch02.ex06;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller("ch02.ex06")
@RequestMapping("ch02/ex06")
public class UserController {
	@GetMapping("login") //@Nullable도 가능하긴함
	public String loginIn(@CookieValue(required=false) String username, @ModelAttribute("user") UserDto user) {
			user.setUsername(username);
		return "ch02/ex06/login";
	}
	
	//쿠키를 response에 집어넣음	
	//HttpServletResponse 이러면 알아서 컨테이너가 response객체 넣어줌
	//로그인헀다표현을 세션에 값의 유무로 확인해야하기때문에 세션도필요
	@PostMapping("login")
	public String login(@ModelAttribute("user")UserDto user, String rememberMe,
			HttpSession session,
			HttpServletResponse response) {
		session.setAttribute("username", user.getUsername());

		
		if(rememberMe != null && rememberMe.equals("on")) {
			Cookie cookie = new Cookie("username", user.getUsername());
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}
		
		
		return "ch02/ex06/logout";
	}
	//redirect써야함 한작업마다 쓴다보면됨 작업의 끝은 새로운 시작.
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
}
