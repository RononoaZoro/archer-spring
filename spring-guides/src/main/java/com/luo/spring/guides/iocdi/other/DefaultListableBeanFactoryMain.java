package com.luo.spring.guides.iocdi.other;

import com.luo.spring.guides.common.TestBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class DefaultListableBeanFactoryMain {

    public static void main(String... args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new ClassPathResource("iocdi/injection/other/xml-bean-factory-config.xml"));
        TestBean testBean = (TestBean) factory.getBean("testBeanName");
        System.out.println(testBean.getTestStr());
    }
}
