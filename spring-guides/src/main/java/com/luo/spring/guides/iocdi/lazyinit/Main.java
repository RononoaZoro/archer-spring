package com.luo.spring.guides.iocdi.lazyinit;

import com.luo.spring.guides.iocdi.domain.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/1 13:32
 * @description :
 */
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:iocdi/injection/lazyinit/app-context-lazy-xml.xml");
        ctx.refresh();
        Singer singer = ctx.getBean("singer",
                Singer.class);
        singer.sing();
        ctx.close();
    }
}
