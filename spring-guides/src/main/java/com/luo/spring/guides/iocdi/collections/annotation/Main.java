package com.luo.spring.guides.iocdi.collections.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 17:41
 * @description :
 */
public class Main {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:iocdi/injection/collections/app-context-annotation.xml");
        ctx.refresh();

        CollectionInjection instance = (CollectionInjection) ctx.getBean("injectCollection");
        instance.displayInfo();

        ctx.close();
    }
}
