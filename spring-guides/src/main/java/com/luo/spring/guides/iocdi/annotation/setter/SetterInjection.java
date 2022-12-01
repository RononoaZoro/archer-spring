package com.luo.spring.guides.iocdi.annotation.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("setterInjection")
public class SetterInjection {

	private Dependency dependency;

	@Autowired
	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return dependency.toString();
	}
}
