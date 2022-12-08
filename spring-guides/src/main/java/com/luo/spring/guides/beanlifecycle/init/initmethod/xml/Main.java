package com.luo.spring.guides.beanlifecycle.init.initmethod.xml;

import com.luo.spring.guides.beanlifecycle.init.initmethod.domain.Singer;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/8 15:41
 * @description :
 */
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:beanlifecycle/init/app-context-initmethod.xml");
        ctx.refresh();

        getBean("singerOne", ctx);
        getBean("singerTwo", ctx);
        getBean("singerThree", ctx);

        ctx.close();
    }

    public static Singer getBean(String beanName, ApplicationContext ctx) {
        try {
            Singer bean = (Singer) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println("An error occurred in bean configuration: "
                    + ex.getMessage());
            return null;
        }
    }
}
