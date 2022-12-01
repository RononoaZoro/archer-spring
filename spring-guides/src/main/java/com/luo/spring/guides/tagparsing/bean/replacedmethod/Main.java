package com.luo.spring.guides.tagparsing.bean.replacedmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/10/14 11:57
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("tagparsing/bean/replaced/replacedMethodTest.xml");
        TestChangeMethod test = (TestChangeMethod) bf.getBean("testChangeMethod");
        test.changeMe();
    }
}
