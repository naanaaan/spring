package spring.core.ch01.ex02;

import lombok.NoArgsConstructor;
import spring.core.ch01.ex01.Gun;
//lombok으로 생성자안만들고 어노테이션으로 알아서 추가하게끔 할 수 있음.
@NoArgsConstructor
public class Shooter {
	private String shooterName;
	private Gun gun;
}
