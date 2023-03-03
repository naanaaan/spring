package spring.core.ch02.ex01;

public class Rabbite {
	private void sleep() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
			
		} catch(Exception e) {}
	}
}
