package org.dhcao.relax.spring.code;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class Home {

	private String name;
	private String age;
	@Autowired
	private Desk desk;


	public Desk getDesk() {
		return desk;
	}


	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
