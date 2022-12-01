package com.luo.spring.guides.iocdi.alias.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

/**
 * @author : archer
 * @date : Created in 2022/11/30 19:19
 * @description :
 */
public class Main {

    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AliasConfig.AliasBeanConfig.class);
        Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
        beans.entrySet().stream().forEach(b ->
                System.out.println(
                        "id: " + b.getKey() + "\n aliases: "
                                + Arrays.toString(ctx.getAliases(b.getKey())) + "\n")
        );
        ctx.close();
    }
}
