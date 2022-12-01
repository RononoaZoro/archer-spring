package com.luo.spring.guides.iocdi.mixed;

import com.luo.spring.guides.common.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/1 13:53
 * @description :
 */
public class Main {
    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (MixedConfiguration.class);
        TestBean mr = ctx.getBean("testBean", TestBean.class);
        System.out.println(mr);
    }
}
