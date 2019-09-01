package org.dhcao.relax.spring.replaced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		TestChangeMethod method = (TestChangeMethod) context.getBean("testChangeMethod");
		method.changeMe();
	}
}
