package org.dhcao.relax.spring.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		GetBeanTest bean =(GetBeanTest) context.getBean("getBeanTest");
		bean.showMe();
	}
}
