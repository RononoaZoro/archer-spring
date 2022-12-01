package com.luo.spring.guides.iocdi.lookup.xml;

public class StandardLookupDemoBean implements DemoBean {

	private Singer mySinger;

	public void setMySinger(Singer mySinger) {
		this.mySinger = mySinger;
	}

	@Override
	public Singer getMySinger() {
		return this.mySinger;
	}

	@Override
	public void doSomething() {
		mySinger.sing();
	}
}
