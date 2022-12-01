package com.luo.spring.guides.iocdi.xml.setter;

public class SetterInjection {

	private Dependency dependency;

	private String message;

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return dependency.toString();
	}
}
