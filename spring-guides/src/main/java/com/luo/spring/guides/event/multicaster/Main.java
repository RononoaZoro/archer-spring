package com.luo.spring.guides.event.multicaster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2023/1/9 19:43
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("event/listener.xml");
        ctx.publishEvent(new TestEvent("hello","i am a message"));
    }
}
