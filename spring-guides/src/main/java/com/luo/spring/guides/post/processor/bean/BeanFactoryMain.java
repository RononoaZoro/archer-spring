package com.luo.spring.guides.post.processor.bean;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : archer
 * @date : Created in 2023/1/9 15:55
 * @description :
 */
public class BeanFactoryMain {
    public static void main(String[] args) {
        ConfigurableListableBeanFactory ctx = new XmlBeanFactory(new ClassPathResource("postprocessor/bean/bean-processor.xml"));

    }
}
