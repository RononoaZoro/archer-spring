package com.luo.spring.guides.beanlifecycle.aware.classloader;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.stereotype.Component;

/**
 * @author : archer
 * @date : Created in 2022/12/6 15:51
 * @description :
 */
@Component
public class SingerClassLoaderBean implements BeanClassLoaderAware {

    private ClassLoader classLoader;

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public void print(){
        System.out.println(classLoader);
    }
}
