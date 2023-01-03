package com.luo.spring.guides.aop.pointcut.introduction;

import org.springframework.aop.IntroductionAdvisor;
import org.springframework.aop.framework.ProxyFactory;

@SuppressWarnings("all")
public class Main {
    public static void main(String... args) {
        Contact target = new Contact();
        target.setName("John Mayer");

        IntroductionAdvisor advisor = new IsModifiedAdvisor();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        //使用cglib代理方式，默认jdk代理
        pf.setOptimize(true);

        Object proxy = pf.getProxy();

        System.out.println("Is Contact?: " + (proxy instanceof Contact));
        System.out.println("Is IsModified?: " + (proxy instanceof IsModified));

        Contact contact = (Contact) pf.getProxy();
        IsModified proxyInterface = (IsModified)proxy;
        System.out.println("Has been modified?: " + 
            proxyInterface.isModified());

        contact.setName("John Mayer");

        System.out.println("Has been modified?: " + 
            proxyInterface.isModified());

        contact.setName("Eric Clapton");

        System.out.println("Has been modified?: " + 
            proxyInterface.isModified());
    }
}
