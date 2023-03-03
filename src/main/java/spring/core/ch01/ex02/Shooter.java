package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

//lombok으로 생성자안만들고 어노테이션으로 알아서 추가하게끔 할 수 있음.
@NoArgsConstructor
@AllArgsConstructor // 요건 필드값으로 생성자 만들어줌.
@Setter // 요건 setter알아서 만들어줌
//lombok 레코드나오기전에 유행했음 record로 가능하면 record쓰자
public class Shooter {
	private String shooterName;
	private Gun gun;

	public void fire() {
		System.out.print(shooterName + ": ");
		gun.fire();
	}
}
