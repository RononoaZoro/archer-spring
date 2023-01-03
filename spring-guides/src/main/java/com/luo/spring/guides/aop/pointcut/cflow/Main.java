package com.luo.spring.guides.aop.pointcut.cflow;

import com.luo.spring.guides.aop.simple.beforeadvice.SimpleBeforeAdvice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Main {
    public static void main(String... args) {
        Main ex = new Main();
        ex.run();
    }

    public void run() {
        ControlFlowTestBean target = new ControlFlowTestBean();

        //方法名为 test 才触发通知
        Pointcut pc = new ControlFlowPointcut(Main.class, "test");
        Advisor advisor = new DefaultPointcutAdvisor(pc, 
            new SimpleBeforeAdvice());

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);

        ControlFlowTestBean proxy = (ControlFlowTestBean) pf.getProxy();
 
        System.out.println("Trying normal invoke");
        proxy.foo();
        System.out.println("Trying under ControlFlowDemo.test()");
        test(proxy);
    }

    private void test(ControlFlowTestBean bean) {
        bean.foo();
    }

}
