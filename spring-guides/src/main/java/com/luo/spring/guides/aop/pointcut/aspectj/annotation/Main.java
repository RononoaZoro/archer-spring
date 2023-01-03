package com.luo.spring.guides.aop.pointcut.aspectj.annotation;

import com.luo.spring.guides.aop.pointcut.aspectj.annotation.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/13 14:38
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        NewDocumentarist documentarist = ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();

        ctx.close();
    }
}
