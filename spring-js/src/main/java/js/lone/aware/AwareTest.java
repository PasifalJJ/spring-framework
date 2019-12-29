package js.lone.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("js.lone.aware");
		Weapon weapon = applicationContext.getBean(Weapon.class);
		String name = weapon.getName();
		System.err.println("name = " + name);
	}
}
