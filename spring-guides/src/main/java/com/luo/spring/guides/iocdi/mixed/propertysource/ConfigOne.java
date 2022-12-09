package com.luo.spring.guides.iocdi.mixed.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:mixed/message.properties")
public class ConfigOne {

	@Autowired
	Environment env;

	@Bean
	public String string() {
		return env.getProperty("message");
	}
}
