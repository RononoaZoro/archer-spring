package com.luo.spring.guides.aop.pointcut.composable;

import org.springframework.aop.support.StaticMethodMatcher;

import java.lang.reflect.Method;

/**
 * @author : archer
 * @date : Created in 2022/12/13 17:09
 * @description :
 */
public class TalkMethodMatcher extends StaticMethodMatcher {
    @Override
    public boolean matches(Method method, Class<?> cls) {
        return "talk".equals(method.getName());
    }
}