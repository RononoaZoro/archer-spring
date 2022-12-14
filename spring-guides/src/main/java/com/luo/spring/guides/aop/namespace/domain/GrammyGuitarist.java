package com.luo.spring.guides.aop.namespace.domain;

/**
 * Created by iuliana.cosmina on 4/2/17.
 */
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
