package com.luo.spring.guides.post.processor.bean;

import com.luo.spring.guides.common.TestBean;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2023/1/9 15:42
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:postprocessor/bean/bean-processor.xml");
        ctx.refresh();
        ctx.close();
    }
}
