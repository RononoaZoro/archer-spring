package com.luo.spring.boot.guides;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iuliana.cosmina on 3/19/17.
 */
@RestController
public class HelloWorld {

	@RequestMapping("/")
	public String sayHi() {
		return "Hello World!";
	}
}
