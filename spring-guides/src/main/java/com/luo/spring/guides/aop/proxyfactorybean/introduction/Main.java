package com.luo.spring.guides.aop.proxyfactorybean.introduction;

import com.luo.spring.guides.aop.proxyfactorybean.introduction.domain.Contact;
import com.luo.spring.guides.aop.proxyfactorybean.introduction.domain.IsModified;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SuppressWarnings("all")
public class Main {
    public static void main(String... args) {
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("classpath:proxyfactorybean/introduction/app-context-xml.xml");
//        ctx.refresh();
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Contact bean = (Contact) ctx.getBean("bean");
        IsModified mod = (IsModified) bean;

        System.out.println("Is Contact?: " + (bean instanceof Contact));
        System.out.println("Is IsModified?: " + (bean instanceof IsModified));

        System.out.println("Has been modified?: " + mod.isModified());
        bean.setName("John Mayer");

        System.out.println("Has been modified?: " + mod.isModified());
        bean.setName("Eric Clapton");

        System.out.println("Has been modified?: " + mod.isModified());
    }
}
