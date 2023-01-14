package com.luo.spring.guides.aop.simple.demo.exposeproxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author : archer
 * @date : Created in 2023/1/11 14:34
 * @description :
 */
@Aspect
@Component
public class AspectJServiceTest {

    //必须被次切入点匹配到的方法所在的类中，才能使用 <aop:aspectj-autoproxy expose-proxy="true"/> 中的 属性，如 expose-proxy="true"
    @Pointcut("(execution(* *.a(..)) || execution(* *.c(java.lang.String))) && args(source)")
    public void test(String source) {
    }

    @Before("test(source)")
    public void beforeTest(String source) {
        System.out.println(source + ":beforeTest");
    }

    @After("test(source)")
    public void afterTest(String source) {
        System.out.println(source + ":afterTest");
    }

    @Around("test(source)")
    public Object aroundTest(ProceedingJoinPoint p, String source) {
        System.out.println(source + ":around before");

        Object o = null;
        try {
            o = p.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        System.out.println(source + ":around after");
        return o;
    }
}
