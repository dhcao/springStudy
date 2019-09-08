package org.dhcao.relax.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class aopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        final TestBean test = (TestBean) context.getBean("test");
        test.test();
    }
}