package com.luo.spring.guides.iocdi.lazyinit.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 2/22/17.
 */
@Component
@Lazy
public class Guitar {

	public void sing(){
		System.out.println("Cm Eb Fm Ab Bb");
	}
}
