package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component//("rifleGun") //아이디직접지정
public class Rifle implements Gun{
	@Override
	public void fire() {
		System.out.println("소통 탕탕");
	}

}
