package spring.core.ch01.ex06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //type class 동의어
@Retention(RetentionPolicy.RUNTIME)
public @interface NoComponent {

}
