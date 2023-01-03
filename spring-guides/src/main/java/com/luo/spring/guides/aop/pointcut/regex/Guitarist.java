package com.luo.spring.guides.aop.pointcut.regex;


import com.luo.spring.guides.aop.pointcut.Singer;

/**
 * Created by iuliana.cosmina on 4/2/17.
 */
public class Guitarist implements Singer {

	@Override public void sing() {
		System.out.println("Just keep me where the light is");
	}

	public void sing2() {
		System.out.println("Oh gravity, stay the hell away from me");
	}

	public void rest() {
		System.out.println("zzz");
	}

}
