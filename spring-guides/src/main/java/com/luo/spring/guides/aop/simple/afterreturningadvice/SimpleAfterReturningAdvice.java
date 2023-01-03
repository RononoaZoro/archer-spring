package com.luo.spring.guides.aop.simple.afterreturningadvice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class SimpleAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, 
             Object[] args, Object target) throws Throwable {
        System.out.println("After return:" + method.getName());
    }
}
