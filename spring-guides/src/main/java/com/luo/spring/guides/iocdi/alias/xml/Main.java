package com.luo.spring.guides.iocdi.alias.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

/**
 * @author : archer
 * @date : Created in 2022/11/30 19:09
 * @description :
 */
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:iocdi/injection/alias/app-context-alias.xml");
        ctx.refresh();

        String s1 = (String) ctx.getBean("john");
        String s2 = (String) ctx.getBean("jon");
        String s3 = (String) ctx.getBean("johnny");
        String s4 = (String) ctx.getBean("jonathan");
        String s5 = (String) ctx.getBean("jim");
        String s6 = (String) ctx.getBean("ion");

        System.out.println((s1 == s2));
        System.out.println((s2 == s3));
        System.out.println((s3 == s4));
        System.out.println((s4 == s5));
        System.out.println((s5 == s6));

        Map<String,String> beans = ctx.getBeansOfType(String.class);

        if(beans.size() == 3) {
            System.out.println("There is only 3 String bean.");
        }

        beans.entrySet().stream().forEach(b ->
                System.out.println(
                        "id: " + b.getKey() + "\n aliases: "
                                + Arrays.toString(ctx.getAliases(b.getKey())) + "\n")
        );

        ctx.close();
    }
}
