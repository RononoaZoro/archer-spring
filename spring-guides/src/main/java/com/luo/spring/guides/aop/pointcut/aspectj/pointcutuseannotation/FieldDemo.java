package com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation;

import lombok.Data;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

/**
 * @author : archer
 * @date : Created in 2023/3/23 15:32
 * @description :
 */
@Data
public class FieldDemo {
    @MyAnnotation("bbb")
    private String aaa;
}

//    public Object around(ProceedingJoinPoint joinPoint, MyAnnotation annotation) throws Throwable {
//        Field field = (Field) joinPoint.getThis();
//        String fieldName = field.getName();
//        Object fieldValue = field.get(joinPoint.getTarget());
//        String annotationValue = annotation.value();
//        System.out.println("Field " + fieldName + " has a value of " + fieldValue + " and annotation value of " + annotationValue);
//        return joinPoint.proceed();
//    }

