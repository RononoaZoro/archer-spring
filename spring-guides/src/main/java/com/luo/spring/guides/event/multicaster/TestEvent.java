package com.luo.spring.guides.event.multicaster;

import org.springframework.context.ApplicationEvent;

/**
 * @author : archer
 * @date : Created in 2023/1/9 17:59
 * @description :
 */
public class TestEvent extends ApplicationEvent {

    private String msg;


    public TestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public void print() {
        System.out.println("received: " + msg);
    }
}
