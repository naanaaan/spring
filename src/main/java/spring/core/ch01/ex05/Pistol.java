package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component  //ex05 스캔함 id는 클래스명을 딴다. 대문자아니라 pistol 소문자
public class Pistol implements Gun {
	@Override
	public void fire() {
		System.out.println("권총 탕탕");
	}

}
