package com.luo.spring.guides.aop.pointcut.aspectj;

import com.luo.spring.guides.aop.pointcut.advice.SimpleAdvice;
import com.luo.spring.guides.aop.pointcut.regex.Guitarist;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Main {
    public static void main(String... args) {
        Guitarist guitarist = new Guitarist();

        AspectJExpressionPointcut pc = new AspectJExpressionPointcut();
        pc.setExpression("execution(* sing*(..))");
        Advisor advisor = new DefaultPointcutAdvisor(pc, new SimpleAdvice());

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(guitarist);
        pf.addAdvisor(advisor);
        Guitarist proxy = (Guitarist) pf.getProxy();

        proxy.sing();
        proxy.sing2();
        proxy.rest();
    }
}
