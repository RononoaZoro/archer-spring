package com.luo.spring.guides.iocdi.nesting;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/1 13:26
 * @description :
 */
public class Main {

    public static void main(String... args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:iocdi/injection/nesting/parent-context.xml");
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("classpath:iocdi/injection/nesting/child-context.xml");
        child.setParent(parent);
        child.refresh();

        Song song1 = (Song) child.getBean("song1");
        Song song2 = (Song) child.getBean("song2");
        Song song3 = (Song) child.getBean("song3");

        System.out.println("from parent ctx: " + song1.getTitle());
        System.out.println("from child ctx: " + song2.getTitle());
        System.out.println("from parent ctx: " + song3.getTitle());

        child.close();
        parent.close();
    }
}
