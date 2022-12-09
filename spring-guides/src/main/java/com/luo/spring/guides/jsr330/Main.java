package com.luo.spring.guides.jsr330;

import com.luo.spring.guides.profiles.annotation.HighschoolConfig;
import com.luo.spring.guides.profiles.annotation.KindergartenConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {

	public static void main(String... args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(Jsr330Config.class);

		MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
		renderer.render();

		ctx.close();
	}
}
