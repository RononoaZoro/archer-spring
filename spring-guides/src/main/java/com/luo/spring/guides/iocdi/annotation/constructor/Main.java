package com.luo.spring.guides.iocdi.annotation.constructor;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 14:51
 * @description :
 */
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:iocdi/app-context-annotation.xml");
        ctx.refresh();

        ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
        System.out.println(cc);
        ctx.close();
    }
}
