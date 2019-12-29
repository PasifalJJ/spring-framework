package js.lone.aware;

import org.springframework.stereotype.Component;

@Component
public class Gun {
	private String name = "gun";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
