package com.luo.spring.guides.iocdi.annotation.field;

import com.luo.spring.guides.iocdi.annotation.InjectionConfiguration;
import com.luo.spring.guides.iocdi.annotation.setter.SetterInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 20:46
 * @description :
 */
public class Main {

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (InjectionConfiguration.class);
        Singer singer = ctx.getBean("singer", Singer.class);

        Singer singerBean = ctx.getBean(Singer.class);
        System.out.println(singer == singerBean);
        singerBean.sing();
        singer.sing();
    }
}
