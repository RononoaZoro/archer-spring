package com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : archer
 * @date : Created in 2023/3/23 16:41
 * @description :
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableMyAnnotation {
}
