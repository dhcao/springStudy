package org.dhcao.relax.spring.myApplicationContext;

import org.springframework.context.ApplicationContext;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class SpringTestC {
    public static void main(String[] args) {
        ApplicationContext context = new MyClassPathXmlApplicationContext("spring-context.xml");
//        context.getBean("home");
    }
}
