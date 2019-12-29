package js.lone.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Sword implements BeanNameAware {
	private String name;
	private String num;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public void setBeanName(String name) {
		System.err.println("------------------------- sword");
	}
}
