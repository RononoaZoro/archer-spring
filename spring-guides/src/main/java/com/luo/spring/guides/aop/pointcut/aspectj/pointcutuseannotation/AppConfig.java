package com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by iuliana.cosmina on 4/9/17.
 */
@Configuration
@ComponentScan(basePackages = {"com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}
