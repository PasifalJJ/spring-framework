package js.lone.aware;

import org.springframework.stereotype.Component;

@Component
public class Weapon {
	private String name;

	private Sword sword;

	private Gun gun;

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}
}
