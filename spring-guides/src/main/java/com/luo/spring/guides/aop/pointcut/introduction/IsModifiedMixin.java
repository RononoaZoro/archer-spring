package com.luo.spring.guides.aop.pointcut.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

//对象修改检测技术，可用于检测是否有值被更改过，改过就入库，否则不入库，减少与数据库的链接次数
@SuppressWarnings("all")
public class IsModifiedMixin extends DelegatingIntroductionInterceptor 
        implements IsModified {
    private boolean isModified = false;

    private Map<Method, Method> methodCache = new HashMap<>();

    @Override
    public boolean isModified() {
        return isModified;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        if (!isModified) {
            if ((invocation.getMethod().getName().startsWith("set"))
                && (invocation.getArguments().length == 1)) {

                Method getter = getGetter(invocation.getMethod());

                if (getter != null) {
                    Object newVal = invocation.getArguments()[0];
                    Object oldVal = getter.invoke(invocation.getThis(),null);

                    if((newVal == null) && (oldVal == null)) {
                        isModified = false;
                    } else if((newVal == null) && (oldVal != null)) {
                        isModified = true;
                    } else if((newVal != null) && (oldVal == null)) {
                        isModified = true;
                    } else {
                        isModified = !newVal.equals(oldVal);
                    }
                }
            }
        }

        return super.invoke(invocation);
    }


    private Method getGetter(Method setter) {
        Method  getter = methodCache.get(setter);

        if (getter != null) {
            return getter;
        }

        String getterName = setter.getName().replaceFirst("set", "get");
        try {
            getter = setter.getDeclaringClass().getMethod(getterName, null);
            synchronized (methodCache) {
                methodCache.put(setter, getter);
            }
            return getter;
        } catch (NoSuchMethodException ex) {
            return null;
        }
    }
}
