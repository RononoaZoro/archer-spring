package com.luo.spring.guides.spel;

import com.luo.spring.guides.common.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/15 14:59
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        //下面两者等价
//        ApplicationContext bf = new ClassPathXmlApplicationContext("spel/app-context-spel.xml");
        ApplicationContext bf = new ClassPathXmlApplicationContext("spel/app-context-common.xml");
        SpelTestBean test = (SpelTestBean) bf.getBean("spelTestBean");
        System.out.println(test.getTestBean().getTestStr());
    }
}
