package com.luo.spring.guides.iocdi.lazyinit.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/1 13:47
 * @description :
 */
public class Main {

    @Configuration
    @ComponentScan(basePackages = {"com.luo.spring.guides.iocdi.lazyinit.annotation"})
    public static class LazyConfig {}

    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(LazyConfig.class);
        Singer singer = ctx.getBean("singer",
                Singer.class);
        singer.sing();
    }
}
