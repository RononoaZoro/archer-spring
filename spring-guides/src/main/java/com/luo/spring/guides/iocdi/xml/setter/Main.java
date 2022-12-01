package com.luo.spring.guides.iocdi.xml.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 15:22
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("iocdi/injection/setter/app-context-xml.xml");

        SetterInjection mr = ctx.getBean("setterInjection", SetterInjection.class);
        System.out.println(mr);
        System.out.println(mr.getMessage());
    }
}
