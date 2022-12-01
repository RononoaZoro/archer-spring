package com.luo.spring.guides.iocdi.annotation.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusion {

	private String someValue;

	public ConstructorConfusion(String someValue) {
		System.out.println("ConstructorConfusion(String) called");
		this.someValue = someValue;
	}

	@Autowired
	public ConstructorConfusion(@Value("90") int someValue) {
		System.out.println("ConstructorConfusion(int) called");
		this.someValue = "Number: " + Integer.toString(someValue);
	}

	public String toString() {
		return someValue;
	}
}
