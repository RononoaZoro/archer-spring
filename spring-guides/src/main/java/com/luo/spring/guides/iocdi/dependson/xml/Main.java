package com.luo.spring.guides.iocdi.dependson.xml;

import com.luo.spring.guides.iocdi.dependson.domain.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/30 19:29
 * @description :
 */
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("iocdi/injection/dependson/app-context-xml.xml");
        ctx.refresh();

        Singer johnMayer = ctx.getBean("johnMayer", Singer.class);
        johnMayer.sing();

        ctx.close();
    }

}
