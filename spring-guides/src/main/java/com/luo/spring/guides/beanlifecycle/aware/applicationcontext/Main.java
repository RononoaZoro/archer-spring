package com.luo.spring.guides.beanlifecycle.aware.applicationcontext;

import com.luo.spring.guides.beanlifecycle.aware.classloader.SingerClassLoaderBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : archer
 * @date : Created in 2022/12/8 14:20
 * @description :
 */
public class Main {

    @Configuration
    @ComponentScan(basePackages = {"com.luo.spring.guides.beanlifecycle.aware.applicationcontext"})
    public static class MConfiguration {
    }

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MConfiguration.class);
        Singer singer = (Singer) ctx.getBean("singer");
        singer.sing();
    }
}
