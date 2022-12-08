package com.luo.spring.guides.factorybean.xml;

import com.luo.spring.guides.factorybean.MessageDigester;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.security.MessageDigest;

public class Main {
    public static void main(String... args) throws Exception {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:factorybean/app-context-xml.xml");
        ctx.refresh();

        MessageDigester digester = (MessageDigester) ctx.getBean("digester");
        digester.digest("Hello World!");

        System.out.println("==========我是分割线=============");

        MessageDigest shaDigest1 = ctx.getBean("shaDigest", MessageDigest.class);
        System.out.println(shaDigest1.digest("Hello World".getBytes()).toString());

        System.out.println("digester.getDigest1()==shaDigest2:" + (digester.getDigest1() == shaDigest1));

        ctx.close();
    }
}
