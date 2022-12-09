package com.luo.spring.guides.iocdi.mixed.propertysource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigOne.class);

        String string = ctx.getBean("string", String.class);

        System.out.println(string);
    }
}
