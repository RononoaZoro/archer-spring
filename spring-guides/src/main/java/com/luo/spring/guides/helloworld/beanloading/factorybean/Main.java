package com.luo.spring.guides.helloworld.beanloading.factorybean;

import com.luo.spring.guides.helloworld.common.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/10/28 10:49
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("beanloading/factorybean/facotryBeanTest.xml");

        Car car = (Car) bf.getBean("car");
        System.out.println(car);

        CarFactoryBean carFactoryBean = (CarFactoryBean) bf.getBean("&car");
        System.out.println(carFactoryBean.getClass());
    }
}
