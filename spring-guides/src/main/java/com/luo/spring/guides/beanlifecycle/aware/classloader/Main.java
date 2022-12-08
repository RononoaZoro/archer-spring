package com.luo.spring.guides.beanlifecycle.aware.classloader;

import com.luo.spring.guides.iocdi.annotation.field.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : archer
 * @date : Created in 2022/12/6 15:52
 * @description :
 */
public class Main {

    @Configuration
    @ComponentScan(basePackages = {"com.luo.spring.guides.beanlifecycle.aware.classloader"})
    public static class ClassloaderConfiguration{}

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (ClassloaderConfiguration.class);
        SingerClassLoaderBean singerClassLoaderBean = ctx.getBean("singerClassLoaderBean", SingerClassLoaderBean.class);


        singerClassLoaderBean.print();
    }
}
