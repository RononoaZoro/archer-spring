package com.luo.spring.guides.iocdi.lookup.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("standardLookupBean")
public class StandardLookupDemoBean implements DemoBean {

	private Singer mySinger;

//	@Autowired
//	@Qualifier("singer")
	@Resource(name = "singer")
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
