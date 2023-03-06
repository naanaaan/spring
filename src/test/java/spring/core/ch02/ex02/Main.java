package spring.core.ch02.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calculator = ctx.getBean(Calculator.class); //타입별로가능 기본값이 싱글톤이라서
		Rabbit rabbit = ctx.getBean(Rabbit.class);
		
		System.out.println(calculator.calc().getResult());
		System.out.println(rabbit.sleep().getResult());
	}
}
