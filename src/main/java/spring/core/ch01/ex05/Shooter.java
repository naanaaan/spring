package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	//지금은 ID와 맴버변수 네임이 같아야하지만 bean하나만쓸떄는 안똑같아도 괜찮
	@Autowired @Nullable private Gun pistol; //없으면 null값
	@Autowired @Nullable private Gun rifle;
	
	public void fire(){
	try {
		pistol.fire();
		rifle.fire();
	} catch(NullPointerException e) {}
	}
}
