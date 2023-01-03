package com.luo.spring.guides.aop.simple.throwsadvice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class SimpleThrowsAdvice implements ThrowsAdvice {


    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("******");
        System.out.println("Generic Exception Capture");
        System.out.println("Caught: " + ex.getClass().getName());
        System.out.println("******\n");
    }

    //如果异常类型相同，Spring 优先使用参数多个那个
    public void afterThrowing(Method method, Object[] args, Object target, IllegalArgumentException ex) throws Throwable {
        System.out.println("******");
        System.out.println("IllegalArgumentException Capture");
        System.out.println("Caught: " + ex.getClass().getName());
        System.out.println("Method: " + method.getName());
        System.out.println("******\n");
    }
}
