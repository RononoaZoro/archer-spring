package com.luo.spring.guides.beanlifecycle.aware.name;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/6 15:38
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("beanlifecycle/aware/name/app-context-name.xml");
        ctx.refresh();

        NamedSinger bean = (NamedSinger) ctx.getBean("namedSinger");
        bean.sing();

        ctx.close();
    }

}
