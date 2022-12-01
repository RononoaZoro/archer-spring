package com.luo.spring.guides.iocdi.annotation.setter;

import com.luo.spring.guides.iocdi.annotation.InjectionConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 15:33
 * @description :
 */
public class Main {
    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (InjectionConfiguration.class);
        SetterInjection mr = ctx.getBean("setterInjection", SetterInjection.class);
        System.out.println(mr);
    }
}
