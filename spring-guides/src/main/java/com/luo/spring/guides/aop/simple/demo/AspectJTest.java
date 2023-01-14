package com.luo.spring.guides.aop.simple.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * @author : archer
 * @date : Created in 2023/1/11 14:34
 * @description :
 */
@Aspect
public class AspectJTest {


    @Pointcut("execution(* *.test(..))")
    public void test() {

    }

    @Before("test()")
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After("test()")
    public void afterTest() {
        System.out.println("afterTest");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint p) {
        System.out.println("around before");

        Object o = null;
        try {
            o = p.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        System.out.println("around after");
        return o;
    }
}
