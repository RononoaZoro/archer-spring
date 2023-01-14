package com.luo.spring.guides.post.processor.beanfactory.custom;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : archer
 * @date : Created in 2023/1/9 10:51
 * @description :
 */
public class Main {

    public static void main(String... args) {
        ConfigurableListableBeanFactory ctx = new XmlBeanFactory(new ClassPathResource("postprocessor/custom/app-context-processor-custom.xml"));
        BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) ctx.getBean("bfpp");

        bfpp.postProcessBeanFactory(ctx);
        System.out.println( ctx.getBean("simpleBean"));
    }
}
