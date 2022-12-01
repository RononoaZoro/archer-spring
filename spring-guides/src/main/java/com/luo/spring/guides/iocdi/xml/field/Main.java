package com.luo.spring.guides.iocdi.xml.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 20:46
 * @description :
 */
public class Main {

    public static void main(String... args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("iocdi/injection/field/app-context-xml.xml");
        Singer singer = ctx.getBean("singer", Singer.class);

        Singer singerBean = ctx.getBean(Singer.class);
        System.out.println(singer == singerBean);
        singerBean.sing();
        singer.sing();
    }
}
