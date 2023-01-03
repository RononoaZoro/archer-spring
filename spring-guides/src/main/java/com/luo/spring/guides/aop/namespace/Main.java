package com.luo.spring.guides.aop.namespace;

import com.luo.spring.guides.aop.namespace.domain.NewDocumentarist;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Comment or de-comment lines 11-13 according to examples in the book
 */
//不好使
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:namespace/app-context-xml-01.xml");
//        ctx.load("classpath:namespace/app-context-xml-02.xml");
//        ctx.load("classpath:namespace/app-context-xml-03.xml");
        ctx.refresh();

        NewDocumentarist documentarist = ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();

        ctx.close();
    }
}
