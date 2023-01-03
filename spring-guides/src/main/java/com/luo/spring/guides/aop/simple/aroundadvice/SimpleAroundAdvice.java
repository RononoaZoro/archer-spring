package com.luo.spring.guides.aop.simple.aroundadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before");

        Object proceed = invocation.proceed();

        System.out.println("after");

        return proceed;
    }
}
