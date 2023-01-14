package com.luo.spring.guides.aop.simple.demo.exposeproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2023/1/13 17:35
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop/aspect/exposeproxy-aspect.xml");
        AService aService = applicationContext.getBean("aService", AService.class);
        aService.a("AService");

    }
}
