package com.luo.spring.guides.iocdi.xml.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by iuliana.cosmina on 2/15/17.
 */
public class Singer {

	@Autowired
	private Inspiration inspirationBean;

	public void sing() {
		System.out.println("... " + inspirationBean.getLyric());
	}
}
