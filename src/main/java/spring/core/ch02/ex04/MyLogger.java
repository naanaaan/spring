package spring.core.ch02.ex04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
	private final Logger logger;
	
	public MyLogger() {
		logger = LogManager.getLogger(MyLogger.class);
	}
	//Log은 어노테이션 즉 Log 어노테이션쓴걸 joinpoint로쓴다는것
	@After("@annotation(spring.core.ch02.ex04.Log)")// joinpoint로삼겟따
	public void log(JoinPoint jp) {
		logger.info(jp.toShortString());
	}
	
	@AfterThrowing(pointcut="@annotation(spring.core.ch02.ex04.Log)", throwing="ex")
	public void logError(JoinPoint jp, Throwable ex) { //ㅜ이에 변수이름이랑 일치해야함
		logger.error(jp.toLongString() + ": " + ex.getMessage());
	}
}
