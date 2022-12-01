package com.luo.spring.guides.iocdi.inheritance;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 20:13
 * @description :
 */
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:iocdi/injection/inheritance/app-context-xml.xml");
        ctx.refresh();

        Singer parent = (Singer) ctx.getBean("parent");
        Singer child = (Singer) ctx.getBean("child");

        System.out.println("Parent:\n" + parent);
        System.out.println("Child:\n" + child);
        System.out.println(parent == child);
    }

}
