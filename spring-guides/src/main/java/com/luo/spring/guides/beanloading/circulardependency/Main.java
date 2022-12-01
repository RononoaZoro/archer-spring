package com.luo.spring.guides.beanloading.circulardependency;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/11/7 19:56
 * @description :
 */
public class Main {

    //constructor 注入
//    public static void main(String[] args) {
//        try {
//            ApplicationContext bf = new ClassPathXmlApplicationContext("beanloading/circulardependency/constructor/constructorcirculardependency.xml");
//    System.out.println(bf.getBean("testA"));
//        } catch (BeansException e) {
//            e.printStackTrace();
//        }
//    }

    //setter 注入
//    public static void main(String[] args) {
//        try {
//            ApplicationContext bf = new ClassPathXmlApplicationContext("beanloading/circulardependency/setter/settercirculardependency.xml");
            //注解式的可以
//            AnnotationConfigApplicationContext bf = new AnnotationConfigApplicationContext("com/luo/spring/guides/helloworld/beanloading/circulardependency");
//            //禁用循环依赖
//            bf.setAllowCircularReferences(false);
//            bf.refresh();
//            ((TestA)bf.getBean("testA")).test();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    //setter 注入 prototype 作用域
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("beanloading/circulardependency/prototype/prototypecirculardependency.xml");
            //设置是否允许循环依赖，默认为 true （允许）
            bf.setAllowCircularReferences(false);
            ((TestA)bf.getBean("testA")).test();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
