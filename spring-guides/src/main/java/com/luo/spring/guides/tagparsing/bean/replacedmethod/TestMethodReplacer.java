package com.luo.spring.guides.tagparsing.bean.replacedmethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author : archer
 * @date : Created in 2022/10/14 11:52
 * @description :
 */
public class TestMethodReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("我替换了原方法");
        return null;
    }
}
