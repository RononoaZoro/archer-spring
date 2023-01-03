package com.luo.spring.guides.aop.pointcut.aspectj.annotation;

import com.luo.spring.guides.aop.pointcut.Singer;
import com.luo.spring.guides.aop.pointcut.domain.Guitar;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 4/9/17.
 */
@Component("johnMayer")
public class GrammyGuitarist implements Singer {

	@Override public void sing() {
		System.out.println("sing: Gravity is working against me\n" +
				"And gravity wants to bring me down");
	}

	public void sing(Guitar guitar) {
		System.out.println("play: " + guitar.play());
	}

	public void rest(){
		System.out.println("zzz");
	}

	public void talk(){
		System.out.println("talk");
	}
}