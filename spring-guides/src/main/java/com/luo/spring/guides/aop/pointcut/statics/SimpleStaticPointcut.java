package com.luo.spring.guides.aop.pointcut.statics;

import com.luo.spring.guides.aop.pointcut.statics.domain.GoodGuitarist;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

//有很多判断条件，具体参考可重写父类方法
public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> cls) {
        return ("sing".equals(method.getName())) && cls == GoodGuitarist.class;
    }

//    @Override
//    public ClassFilter getClassFilter() {
//        ClassFilter classFilter = cls -> (cls == GoodGuitarist.class);
//        return classFilter;
//    }
}
