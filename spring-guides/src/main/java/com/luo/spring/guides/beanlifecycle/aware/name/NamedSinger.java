package com.luo.spring.guides.beanlifecycle.aware.name;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author : archer
 * @date : Created in 2022/12/6 15:37
 * @description :
 */
public class NamedSinger  implements BeanNameAware {
    private String name;

    /** @Implements {@link BeanNameAware#setBeanName(String)} */
    public void setBeanName(String beanName) {
        this.name = beanName;
    }

    public void sing() {
        System.out.println("Singer [" + name + "] - sing()");
    }
}
