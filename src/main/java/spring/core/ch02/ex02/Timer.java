package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component  //aspect이다 rabbit calculator이랑 성격다른 객체
public class Timer {
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))") //..0개이상 2번째*모든메서드
	private void myPointcut() {}
	
	
	//advise라고 부른다. sleep이 주이고 clock이 보조임 혼자실행하지 않는 메서드
	@Around("myPointcut()")  //주메소드 전후로 실행할떄  around씀 
	//joinpoint가 보조메서드가 들어가서 실행되는 포인트 calculator, rabbit임
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature()); //joinpoint객체 네임출력
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
		
		result.setResult(result.getResult() + "(clock)");
		return result; //jointpoint call한 클라이언트에게 리턴
	}
}
