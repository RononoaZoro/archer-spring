package com.luo.spring.guides.beanloading.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author : archer
 * @date : Created in 2022/11/28 19:53
 * @description :
 */
public class Test implements BeanFactoryAware {

    private BeanFactory beanFactory;

    //声明 bean 的时候，Spring 会自动注入 beanFactory
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }

    public void testAware(){
        Hello hello = (Hello) beanFactory.getBean("hello");
        hello.say();
    }
}
