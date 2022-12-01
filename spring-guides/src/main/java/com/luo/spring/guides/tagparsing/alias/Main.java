package com.luo.spring.guides.tagparsing.alias;

import com.luo.spring.guides.common.TestBean;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/10/25 14:46
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("tagparsing/alias/aliasUseTest.xml");
        TestBean test = (TestBean) bf.getBean("testBean");
        System.out.println(test);
        TestBean test2 = bf.getBean("testBean2", TestBean.class);
        System.out.println(test == test2);
        ComboPooledDataSource dataSource = bf.getBean("componentB", ComboPooledDataSource.class);
        System.out.println(dataSource);
    }
}
