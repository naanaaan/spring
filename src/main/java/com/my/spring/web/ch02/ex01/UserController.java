package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

//Ioc, 핸드러 매핑등록하기 위해 컨트롤러라는걸 알려줘야함
//
@Controller
public class UserController {	//그릇을 맏늘어줌
	//request method가 get이어야 한다는 뜻
	@GetMapping("11") //contextpath다음 주소적음 11url이다. getMapping해줘야 handlermapping이 된다. 그전까진 그냥 매소드
	//즉 /11을 처리할 수 있는 컨트롤러이며 이 메서드를 콜한다는 의미.
	public ModelAndView handler11(ModelAndView mv) {
		//user는 attribute네임으로 쓰임
		mv.addObject("user", new User("최한석", 11));  //모델집어넣음 모델네임 모델값
							//실제 과제만들땐 userservice에서 받고 userservice는 userdao한테 받고 DB에서 받음
		mv.setViewName("ch02/ex01/user"); //view 네임까지만 다름
			//자바 홈페이지에서 그냥 이름만 리턴하고 디스패처 서블릿에서 따로 다른 곳에서 요청하니까.
		return mv;
	}
	
	@GetMapping("21")
	public String handler21(Model model) {
		//컨테이너가 알아서 model도 건네줌 return이 view인데도
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user";
	}
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	
	@GetMapping("ch02/ex01/31")
	public void handler31(User user) {
		//viewname지정안하면 31이 viewname으로 리턴되고 파라미터를 model로 그대로 리턴한다. 모델명은 Class명따라가는데 앞에 대문자를 소문자로바꿈.
		user.setUsername("양승일");
		user.setAge(31);
	}
	
	@GetMapping("ch02/ex01/32") //model name을 위와다르게 따로 지정
	public void handler32(@ModelAttribute("man") User user) {
		user.setUsername("서준환");
		user.setAge(32);
	}
	//클라이언트 요청 handler이 받고 reponse는 결국 view에 servlet에서 만듬.
	@GetMapping("ch02/ex01/41")
	public User handler41(User user) {
		user.setUsername("김가람");
		user.setAge(21);
		
		return user;
	}
	
	@GetMapping("ch02/ex01/42")
	@ModelAttribute("man")
	public User handler42(User user) {
		user.setUsername("박건우");
		user.setAge(41);
		
		return user;
	}
}
