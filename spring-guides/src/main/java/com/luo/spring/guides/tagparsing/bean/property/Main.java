package com.luo.spring.guides.tagparsing.bean.property;

import com.luo.spring.guides.common.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/10/14 15:43
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("tagparsing/bean/property/propertyTest.xml");
        TestBean test = (TestBean) bf.getBean("testBean");
        System.out.println(test);
    }
}
