package org.dhcao.relax.spring.eventListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class EventListenerTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
//        TestEvent event = new TestEvent("hello","msg");
//        context.publishEvent(event );
    }
}
