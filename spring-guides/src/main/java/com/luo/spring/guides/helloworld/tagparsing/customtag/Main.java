package com.luo.spring.guides.helloworld.tagparsing.customtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/10/26 17:16
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("tagparsing/customtag/customtag.xml");
        User user = (User) bf.getBean("userbean");
        System.out.println(user);
    }
}
