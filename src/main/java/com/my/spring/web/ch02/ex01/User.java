package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Data쓰면 lombok에서 getter setter만ㄷ르어줌
@Data
@NoArgsConstructor //생성자
@AllArgsConstructor
public class User {
	private String username;
	private int age;
}
