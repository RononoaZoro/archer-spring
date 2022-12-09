package com.luo.spring.guides.iocdi.mixed.imports;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by iuliana.cosmina on 3/15/17.
 */
@Configuration
@Import(ImportConfigOne.class)
public class ImportConfigTwo {

	@Bean
	public String string() {
		return "abc";
	}
}
