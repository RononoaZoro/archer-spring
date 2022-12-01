package com.luo.spring.guides.applicationcontext.validate.required;

import com.luo.spring.guides.common.TestBean;
import org.springframework.context.ApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/29 16:07
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext bf = new MyClassPathXmlApplicationContext("spring/app-context.xml");
        TestBean testBean1 = (TestBean)bf.getBean("testBean");
        System.out.println(testBean1);
    }
}
