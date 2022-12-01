package com.luo.spring.guides.applicationcontext;

import com.luo.spring.guides.common.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/29 11:15
 * @description :
 */
public class Main {

    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/app-context-xml.xml"));
//        TestBean testBean = (TestBean) beanFactory.getBean("testBean");
//        System.out.println(testBean);

        ApplicationContext bf = new ClassPathXmlApplicationContext("spring/app-context.xml");
        TestBean testBean1 = (TestBean)bf.getBean("testBean");
        System.out.println(testBean1);

//        StandardEnvironment standardEnvironment = new StandardEnvironment();
//        System.out.println();
    }
}
