package com.luo.spring.guides.iocdi.collections.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 17:27
 * @description :
 */
public class Main {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:iocdi/injection/collections/app-context-xml.xml");
        ctx.refresh();

        CollectionInjection instance = (CollectionInjection) ctx.getBean("injectCollection");
        instance.displayInfo();

        ctx.close();
    }
}
