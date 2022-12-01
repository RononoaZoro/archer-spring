package com.luo.spring.guides.beanloading.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/28 19:55
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("beanloading/aware/applicationContext.xml");
            ((Test)bf.getBean("test")).testAware();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
