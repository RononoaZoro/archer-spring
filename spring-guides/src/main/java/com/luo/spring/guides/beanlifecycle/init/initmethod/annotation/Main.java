package com.luo.spring.guides.beanlifecycle.init.initmethod.annotation;

import com.luo.spring.guides.beanlifecycle.init.initmethod.domain.Singer;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/8 15:42
 * @description :
 */
public class Main {

    @Configuration
    static class SingerConfig{

        @Lazy
        @Bean(initMethod = "init")
        Singer singerOne() {
            Singer singerOne = 	new Singer();
            singerOne.setName("John Mayer");
            singerOne.setAge(39);
            return singerOne;
        }

        @Lazy
        @Bean(initMethod = "init")
        Singer singerTwo() {
            Singer singerTwo = 	new Singer();
            singerTwo.setAge(72);
            return singerTwo;
        }

        @Lazy
        @Bean(initMethod = "init")
        Singer singerThree() {
            Singer singerThree = 	new Singer();
            singerThree.setName("John Butler");
            return singerThree;
        }
    }

    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(SingerConfig.class);

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
