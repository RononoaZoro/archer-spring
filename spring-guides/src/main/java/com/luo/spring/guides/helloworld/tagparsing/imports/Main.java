package com.luo.spring.guides.helloworld.tagparsing.imports;

import com.luo.spring.guides.helloworld.common.TestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : archer
 * @date : Created in 2022/10/25 14:46
 * @description :
 */
public class Main {
    public static void main(String[] args) {
//        ApplicationContext bf = new ClassPathXmlApplicationContext("import/applicationContext.xml");
//        TestBean test = (TestBean) bf.getBean("testBean");
//        System.out.println(test);

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("tagparsing/import/applicationContext.xml"));
        TestBean testBean = (TestBean) beanFactory.getBean("testBean");
        System.out.println(testBean);
    }
}
