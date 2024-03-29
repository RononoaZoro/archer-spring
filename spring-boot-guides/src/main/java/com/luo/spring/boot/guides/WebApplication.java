package com.luo.spring.boot.guides;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by iuliana.cosmina on 3/19/17.
 */
@SpringBootApplication(scanBasePackageClasses = HelloWorld.class)
public class WebApplication {

	private static Logger logger = LoggerFactory.getLogger(WebApplication.class);

	public static void main(String... args) throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(WebApplication.class, args);
		assert (ctx != null);
		logger.info("Application started!");

//		System.in.read();
//		ctx.close();
	}
}
