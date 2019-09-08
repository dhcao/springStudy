package org.dhcao.relax.spring.eventListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 定义监听器
 * @Author: dhcao
 * @Version: 1.0
 */
@Component
public class TestListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        System.out.println(event.getClass().getName());

        if (event instanceof TestEvent) {
            System.out.println(111);
            TestEvent testEvent = (TestEvent) event;
            testEvent.print();
        }
    }
}
