package com.luo.spring.guides.aop.namespace.advise;

import com.luo.spring.guides.aop.namespace.domain.Guitar;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by iuliana.cosmina on 4/9/17.
 */
public class ComplexAdvice {
	//默认情况下前置通知优先于环绕通知的执行
	public void simpleBeforeAdvice(JoinPoint joinPoint, Guitar value) {
		if(value.getBrand().equalsIgnoreCase("Gibson")) {
			System.out.println("Executing: " +
					joinPoint.getSignature().getDeclaringTypeName() + " "
					+ joinPoint.getSignature().getName());
		}
	}

	public Object simpleAroundAdvice(ProceedingJoinPoint pjp, Guitar value) throws Throwable {
		System.out.println("Before execution: " +
				pjp.getSignature().getDeclaringTypeName() + " "
				+ pjp.getSignature().getName()
				+ " argument: " + value.getBrand());

		Object retVal = pjp.proceed();

		System.out.println("After execution: " +
				pjp.getSignature().getDeclaringTypeName() + " "
				+ pjp.getSignature().getName()
				+ " argument: " + value.getBrand());

		return retVal;
	}
}
