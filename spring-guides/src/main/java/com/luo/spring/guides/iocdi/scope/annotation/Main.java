package com.luo.spring.guides.iocdi.scope.annotation;

import com.luo.spring.guides.iocdi.scope.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 20:36
 * @description :
 */
public class Main {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:iocdi/injection/scope/app-context-annotation.xml");
        ctx.refresh();

        Singer singer1 = ctx.getBean("nonSingleton", Singer.class);
        Singer singer2 = ctx.getBean("nonSingleton", Singer.class);

        System.out.println("Identity Equal?: " + (singer1 == singer2));
        System.out.println("Value Equal:? " + singer1.equals(singer2));
        System.out.println(singer1);
        System.out.println(singer2);

        ctx.close();
    }
}
