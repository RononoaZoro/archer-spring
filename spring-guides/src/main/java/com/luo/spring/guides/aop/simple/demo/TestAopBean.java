package com.luo.spring.guides.aop.simple.demo;

import lombok.Data;
import org.springframework.aop.framework.AopContext;

/**
 * @author : archer
 * @date : Created in 2023/1/11 14:26
 * @description :
 */
@Data
public class TestAopBean {
    private String testStr = "testStr";

    public void test() {
        ((TestAopBean) AopContext.currentProxy()).demo();
        System.out.println("test");
    }
    public void demo() {
        System.out.println("i am TestAopBean");
    }

}
