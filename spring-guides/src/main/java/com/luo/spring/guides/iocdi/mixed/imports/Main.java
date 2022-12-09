package com.luo.spring.guides.iocdi.mixed.imports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/1 13:53
 * @description :
 */
public class Main {
    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (ImportConfigTwo.class);
        String mr = ctx.getBean("string", String.class);
        System.out.println(mr);
    }
}
