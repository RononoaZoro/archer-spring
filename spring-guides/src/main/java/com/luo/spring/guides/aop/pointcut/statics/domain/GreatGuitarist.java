package com.luo.spring.guides.aop.pointcut.statics.domain;


import com.luo.spring.guides.aop.pointcut.Singer;

/**
 * Created by iuliana.cosmina on 4/2/17.
 */
public class GreatGuitarist implements Singer {

	@Override public void sing() {
		System.out.println("I shot the sheriff, \n" +
				"But I did not shoot the deputy");
	}
}
