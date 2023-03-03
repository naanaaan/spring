package spring.core.ch01.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main { 
	public static void main(String[] args) {						//Main.class패키지에서 app.xml을 뒤진다.
		//이게컨테이너임
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		//Object로 되어있기때문 Shooter타입으로 캐스팅해서 줘
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}
