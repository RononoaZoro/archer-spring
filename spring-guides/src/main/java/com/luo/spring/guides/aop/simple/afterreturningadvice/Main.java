package com.luo.spring.guides.aop.simple.afterreturningadvice;

import com.luo.spring.guides.aop.simple.domain.Agent;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author : archer
 * @date : Created in 2022/12/12 14:55
 * @description :
 */
public class Main {

    public static void main(String... args) {
        Agent target = new Agent();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleAfterReturningAdvice());
        pf.setTarget(target);

        Agent proxy = (Agent) pf.getProxy();
        proxy.speak();
    }
}
