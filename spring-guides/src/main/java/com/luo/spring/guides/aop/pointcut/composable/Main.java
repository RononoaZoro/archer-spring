package com.luo.spring.guides.aop.pointcut.composable;

import com.luo.spring.guides.aop.pointcut.domain.Guitar;
import com.luo.spring.guides.aop.pointcut.namematching.GrammyGuitarist;
import com.luo.spring.guides.aop.simple.beforeadvice.SimpleBeforeAdvice;
import org.springframework.aop.Advisor;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcher;

import java.lang.reflect.Method;

public class Main {
    public static void main(String... args) {
        GrammyGuitarist johnMayer = new GrammyGuitarist();

        ComposablePointcut pc = new ComposablePointcut(ClassFilter.TRUE, 
            new SingMethodMatcher());

        System.out.println("Test 1 >> ");
        GrammyGuitarist proxy = getProxy(pc, johnMayer);
        testInvoke(proxy);
        System.out.println();

        System.out.println("Test 2 >> ");
        pc.union(new TalkMethodMatcher());
        proxy = getProxy(pc, johnMayer);
        testInvoke(proxy);
        System.out.println();

        System.out.println("Test 3 >> ");
        pc.intersection(new RestMethodMatcher());
        proxy = getProxy(pc, johnMayer);
        testInvoke(proxy);
    }

    private static GrammyGuitarist getProxy(ComposablePointcut pc,
            GrammyGuitarist target) {
        Advisor advisor = new DefaultPointcutAdvisor(pc, 
            new SimpleBeforeAdvice());

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        return (GrammyGuitarist) pf.getProxy();
    }

    private static void testInvoke(GrammyGuitarist proxy) {
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.talk();
        proxy.rest();
    }
}
