package com.luo.spring.guides.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.security.MessageDigest;

/**
 * Created by iuliana.cosmina on 3/7/17.
 */
public class Main {

    @Configuration
    static class MessageDigesterConfig {

        @Bean
        public MessageDigestFactoryBean shaDigest() {
            MessageDigestFactoryBean factoryOne = new MessageDigestFactoryBean();
            factoryOne.setAlgorithmName("SHA1");
            return factoryOne;
        }

        @Bean
        public MessageDigestFactoryBean defaultDigest() {
            return new MessageDigestFactoryBean();
        }

        @Bean
        MessageDigester digester() throws Exception {
            MessageDigester messageDigester = new MessageDigester();
            messageDigester.setDigest1(shaDigest().getObject());
            messageDigester.setDigest2(defaultDigest().getObject());
            return messageDigester;
        }
    }

    public static void main(String... args) throws Exception {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(MessageDigesterConfig.class);

        MessageDigester digester = (MessageDigester) ctx.getBean("digester");
        digester.digest("Hello World!");

        System.out.println("==========我是分割线=============");

        MessageDigest shaDigest1 = ctx.getBean("shaDigest", MessageDigest.class);
        System.out.println(shaDigest1.digest("Hello World".getBytes()).toString());

        MessageDigestFactoryBean factoryBean =
                (MessageDigestFactoryBean) ctx.getBean("&shaDigest");
        MessageDigest shaDigest2 = factoryBean.getObject();
        System.out.println(shaDigest2.digest("Hello World".getBytes()).toString());

        System.out.println("shaDigest1==shaDigest2:" + (shaDigest1 == shaDigest2));
        System.out.println("digester.getDigest1()==shaDigest2:" + (digester.getDigest1() == shaDigest2));

        ctx.close();
    }
}
