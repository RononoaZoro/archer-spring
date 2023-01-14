package com.luo.spring.guides.post.processor.beanfactory;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2023/1/3 11:38
 * @description :
 */
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:postprocessor/app-context-processor.xml");
        ctx.refresh();

        PostProcessorTestBean testBean = ctx.getBean("testBean", PostProcessorTestBean.class);
        System.out.println(testBean.getName());
        ctx.close();
    }
}
