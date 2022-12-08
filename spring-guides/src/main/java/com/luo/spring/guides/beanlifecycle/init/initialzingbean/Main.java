package com.luo.spring.guides.beanlifecycle.init.initialzingbean;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/8 15:33
 * @description :
 */
public class Main {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("beanlifecycle/init/app-context-initializingbean.xml");
        ctx.refresh();

        getBean("singerOne", ctx);
        getBean("singerTwo", ctx);
        getBean("singerThree", ctx);

        ctx.close();
    }

    private static SingerWithInterface getBean(String beanName,
                                               ApplicationContext ctx) {
        try {
            SingerWithInterface bean = (SingerWithInterface) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println("An error occurred in bean configuration: "
                    + ex.getMessage());
            return null;
        }
    }
}
