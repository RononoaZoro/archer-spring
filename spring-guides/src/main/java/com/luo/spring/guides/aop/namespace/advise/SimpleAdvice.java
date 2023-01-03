package com.luo.spring.guides.aop.namespace.advise;

import org.aspectj.lang.JoinPoint;

/**
 * Created by iuliana.cosmina on 4/9/17.
 */
public class SimpleAdvice {

	public void simpleBeforeAdvice(JoinPoint joinPoint) {
		System.out.println("Executing: " +
				joinPoint.getSignature().getDeclaringTypeName() + " "
				+ joinPoint.getSignature().getName());
	}
}

