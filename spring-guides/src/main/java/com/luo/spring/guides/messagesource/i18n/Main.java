package com.luo.spring.guides.messagesource.i18n;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;

public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:i18n/app-context-xml.xml");
        ctx.refresh();

//        Locale english = Locale.ENGLISH;
        Locale english = new Locale("en", "EN");
        Locale german = new Locale("de", "DE");

        System.out.println(ctx.getMessage("msg", null, english));
        System.out.println(ctx.getMessage("msg", null, german));

        System.out.println(ctx.getMessage("nameMsg", new Object[] { "John",
                "Mayer" }, english));
        System.out.println(ctx.getMessage("nameMsg", new Object[] { "John",
                "Mayer" }, german));

        System.out.println(ctx.getMessage("buttonName", null, english));
        System.out.println(ctx.getMessage("buttonName", null, german));

        ctx.close();
    }
}
