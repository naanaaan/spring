package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//빈이 매번 새로운 빈을 리턴함 싱글톤은 주소만드를뿐 똑같은 빈을 공유하는 거임
public class Lapin {

}
