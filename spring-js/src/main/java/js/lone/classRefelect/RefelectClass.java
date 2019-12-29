package js.lone.classRefelect;

import js.lone.Attack;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.util.StringUtils;

import java.lang.reflect.Constructor;

public class RefelectClass {
	public static void main(String[] args) throws Exception{
		boolean b = StringUtils.hasText("");
		boolean b1 = StringUtils.hasLength("");
		Class<Attack> attackClass = Attack.class;
		//一般进行创建对象使用的方法
		if (attackClass.isInterface()) {
			throw new BeanInstantiationException(attackClass, "Specified class is an interface");
		}
		Constructor<Attack> declaredConstructor = attackClass.getDeclaredConstructor();
		Attack attack1 = declaredConstructor.newInstance();
	}
}
