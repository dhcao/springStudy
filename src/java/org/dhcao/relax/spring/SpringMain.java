package org.dhcao.relax.spring;

import org.dhcao.relax.spring.code.Home;
import org.dhcao.relax.spring.prototype.TeacherA;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class SpringMain {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
		TeacherA t = (TeacherA) ac.getBean("teacherA");

		System.out.println(t.getClass().getName());
		;

	}


}
