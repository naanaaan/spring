package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Before("execution(* spring..*(int))")
	public void clockStart(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("시작 시각:" + LocalDateTime.now());
	}
	
	@After("within(spring..Calculator)")//within은 특정 class지정
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시각: " + LocalDateTime.now());
	}
	//after보다 먼저 실행됨						//리턴값의 이름을 result?
	@AfterReturning(pointcut="bean(calc*)", returning="result")//bean Id calc로 시작하는걸 pointcut으로 삼겠따.
	public void printResult(JoinPoint jp, int result)//이부분과일치해야함 이위에랑 
	{
		System.out.println(jp.toShortString() + ": " + result); 
	}
}
