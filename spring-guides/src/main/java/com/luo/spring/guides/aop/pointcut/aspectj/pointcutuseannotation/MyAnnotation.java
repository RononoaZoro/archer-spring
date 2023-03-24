package com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : archer
 * @date : Created in 2023/3/23 15:29
 * @description :
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "123";
}
