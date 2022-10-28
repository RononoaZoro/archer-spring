package com.luo.spring.guides.helloworld.tagparsing.beans;

import com.luo.spring.guides.helloworld.common.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/10/25 18:48
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("tagparsing/beans/beansTest.xml");
        TestBean test = (TestBean) bf.getBean("testBean");
        System.out.println(test);
    }
}
