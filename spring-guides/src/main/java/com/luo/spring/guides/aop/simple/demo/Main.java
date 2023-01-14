package com.luo.spring.guides.aop.simple.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2023/1/11 14:47
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop/demo/aspect-demo.xml");
        TestAopBean testAopBean = applicationContext.getBean("testAopBean", TestAopBean.class);
        testAopBean.test();
    }
}
