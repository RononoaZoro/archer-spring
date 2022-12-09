package com.luo.spring.guides.groovy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class Main {

	public static void main(String... args) {
		ApplicationContext context = new GenericGroovyApplicationContext("classpath:groovy/beans.groovy");
		Singer singer = context.getBean("singer", Singer.class);
		System.out.println(singer);
	}
}
