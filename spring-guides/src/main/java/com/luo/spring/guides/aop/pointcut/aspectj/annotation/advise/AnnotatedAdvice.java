package com.luo.spring.guides.aop.pointcut.aspectj.annotation.advise;

import com.luo.spring.guides.aop.pointcut.domain.Guitar;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotatedAdvice {
    //&& args(value) 给通知注解方法传参
    @Pointcut("execution(* com.luo.spring.guides.aop.pointcut.aspectj.annotation..sing*(com.luo.spring.guides.aop.pointcut.domain.Guitar)) && args(value)")
    public void singExecution(Guitar value) {
    }

    @Pointcut("bean(john*)")
    public void isJohn() {
    }

    @Before("singExecution(value) && isJohn()")
    public void simpleBeforeAdvice(JoinPoint joinPoint, Guitar value) {
        if(value.getBrand().equals("Gibson")) {
        System.out.println("Executing: " + 
            joinPoint.getSignature().getDeclaringTypeName() + " "
            + joinPoint.getSignature().getName() + " argument: " + value.getBrand());
        }
    }

    //@Pointcut 中有 && args(value) 才能加入参数（Guitar value）
    @Around("singExecution(value) && isJohn()")
    public Object simpleAroundAdvice(ProceedingJoinPoint pjp, Guitar value) throws Throwable {
        System.out.println("Before execution: " +      
            pjp.getSignature().getDeclaringTypeName() + " "
            + pjp.getSignature().getName()
            + " argument: " + value.getBrand());

        Object retVal = pjp.proceed();

        System.out.println("After execution: " +   
            pjp.getSignature().getDeclaringTypeName() + " "
            + pjp.getSignature().getName()
            + " argument: " + value.getBrand());

        return retVal;
    }
}
