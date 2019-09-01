package org.dhcao.relax.spring.myFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class FactoryTest {
	public static void main(String[] args) {
		ApplicationContext pc = new ClassPathXmlApplicationContext("spring-context.xml");
		Car car = (Car) pc.getBean("car");
		System.out.println(car.getBrand());
		System.out.println(car.getMaxSpeed());
		System.out.println(car.getPrice());

	}
}
