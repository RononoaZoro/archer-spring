package com.luo.spring.guides.beanlifecycle.destory.predestory.xml;

import com.luo.spring.guides.beanlifecycle.destory.predestory.domain.DestructiveBeanWithJSR250;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/8 16:08
 * @description :
 */
public class Main {

    public static void main(String... args) throws Exception {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:beanlifecycle/destroy/app-context-predestory.xml");
        ctx.refresh();

        DestructiveBeanWithJSR250 bean =
                (DestructiveBeanWithJSR250) ctx.getBean("destructiveBean");

        System.out.println("Calling destroy()");
        ctx.close();
        System.out.println("Called destroy()");
    }
}
