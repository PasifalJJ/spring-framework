package js.lone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo01 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("js.lone");
		Attack attack = applicationContext.getBean(Attack.class);
		attack.sayHello();
	}
}
