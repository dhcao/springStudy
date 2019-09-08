package org.dhcao.relax.spring.eventListener;

import org.springframework.context.ApplicationEvent;

/**
 * 定义监听事件
 * @Author: dhcao
 * @Version: 1.0
 */
public class TestEvent extends ApplicationEvent {

    public String msg;

    public TestEvent(Object source) {
        super(source);
    }

    public TestEvent(Object source, String msg){
        super(source);
        this.msg = msg;
    }

    public void print(){
        System.out.println(msg);
    }
}
