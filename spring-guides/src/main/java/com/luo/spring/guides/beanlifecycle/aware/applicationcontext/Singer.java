package com.luo.spring.guides.beanlifecycle.aware.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 2/22/17.
 */
@Component
public class Singer implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public void sing() {
		System.out.println(applicationContext.getId());
    }
}
