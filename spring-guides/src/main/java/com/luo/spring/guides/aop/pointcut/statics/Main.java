package com.luo.spring.guides.aop.pointcut.statics;

import com.luo.spring.guides.aop.pointcut.advice.SimpleAdvice;
import com.luo.spring.guides.aop.pointcut.statics.domain.GoodGuitarist;
import com.luo.spring.guides.aop.pointcut.statics.domain.GreatGuitarist;
import com.luo.spring.guides.aop.pointcut.Singer;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Main {
    public static void main(String... args) {
        GoodGuitarist goodGuitarist = new GoodGuitarist();
        GreatGuitarist greatGuitarist = new GreatGuitarist();

        Singer proxyOne;
        Singer proxyTwo;

        Pointcut pc = new SimpleStaticPointcut();
        Advice advice = new SimpleAdvice();
        Advisor advisor = new DefaultPointcutAdvisor(pc, advice);

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(goodGuitarist);
        proxyOne = (Singer)pf.getProxy();

        pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(greatGuitarist);
        proxyTwo = (Singer)pf.getProxy();

        proxyOne.sing();
        proxyTwo.sing();
    }
}
