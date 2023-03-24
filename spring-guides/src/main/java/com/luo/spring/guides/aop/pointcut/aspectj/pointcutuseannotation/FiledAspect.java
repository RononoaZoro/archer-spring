package com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation;

import com.luo.spring.guides.util.ReflectUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author : archer
 * @date : Created in 2023/3/23 15:29
 * @description :
 */
@Aspect
@Component
public class FiledAspect {

    @Around("@annotation(com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation.EnableMyAnnotation)")
    public Object desensitizeField(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = joinPoint.proceed();
        for (Field field : result.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
                System.out.println("Loggable field: " + field.getName() + ", value: " + myAnnotation.value());
                field.setAccessible(true);
                Object fieldValue = field.get(result);
                if (!(fieldValue instanceof String value)) {
                    continue;
                }
                value += "111";
                field.set(result, value);
            }
        }
        return result;
    }

    @AfterReturning(value = "execution(* com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation.FieldService.getFieldDemo())", returning = "returnValue")
    public void logField(JoinPoint joinPoint, Object returnValue) throws Throwable {

        Class<?> returnType = returnValue.getClass();
        Field[] fields = returnType.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
                System.out.println("Loggable field: " + field.getName() + ", value: " + myAnnotation.value());
                field.setAccessible(true);
                Object fieldValue = field.get(returnValue);
                if (!(fieldValue instanceof String result)) {
                    continue;
                }
                result += "111";
                field.set(returnValue, result);
            }
        }
    }

    private String getFieldName(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        String[] parameterNames = signature.getParameterNames();
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < parameterNames.length; i++) {
            Object arg = args[i];
            if (arg != null && arg.getClass().isAssignableFrom(signature.getReturnType())) {
                try {
                    Field field = arg.getClass().getDeclaredField(parameterNames[i]);
                    if (field.isAnnotationPresent(MyAnnotation.class)) {
                        return field.getName();
                    }
                } catch (NoSuchFieldException e) {

                }
            }
        }
        return null;
    }
}






