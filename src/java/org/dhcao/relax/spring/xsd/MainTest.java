package org.dhcao.relax.spring.xsd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
		User user =(User) ac.getBean("testBean");
		System.out.println(user.getUserName());
		System.out.println(user.getEmail());
	}
}
