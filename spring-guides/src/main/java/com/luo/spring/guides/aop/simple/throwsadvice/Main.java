package com.luo.spring.guides.aop.simple.throwsadvice;

import com.luo.spring.guides.aop.simple.domain.ErrorBean;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author : archer
 * @date : Created in 2022/12/12 15:23
 * @description :
 */
public class Main {
    public static void main(String... args) throws Exception {
        ErrorBean errorBean = new ErrorBean();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(errorBean);
        pf.addAdvice(new SimpleThrowsAdvice());

        ErrorBean proxy = (ErrorBean) pf.getProxy();

        try {
            proxy.errorMethod();
        } catch (Exception ignored) {

        }

        try {
            proxy.otherErrorMethod();
        } catch (Exception ignored) {

        }
    }

}
