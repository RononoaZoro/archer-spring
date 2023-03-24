package com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        FieldService service = ctx.getBean("fieldService", FieldService.class);
        FieldDemo fieldDemo = service.getFieldDemo1();
        System.out.println();

        ctx.close();
    }
}
