package com.luo.spring.guides.event.xml;

import com.luo.spring.guides.event.domain.Publisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/9 11:29
 * @description :
 */
public class Main {

    public static void main(String... args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:event/app-context-xml.xml");

        Publisher pub = (Publisher) ctx.getBean("publisher");
        pub.publish("I send an SOS to the world... ");
        pub.publish("... I hope that someone gets my...");
        pub.publish("... Message in a bottle");
    }
}
