package com.luo.spring.boot.guides;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Created by iuliana.cosmina on 3/19/17.
 */
@RestController
public class HelloWorld {

	@Autowired
	private MessageSource messageSource;
	@RequestMapping("/")
	public String sayHi() {
		Locale english = new Locale("en", "US");
		Locale locale = LocaleContextHolder.getLocale();
		String message = messageSource.getMessage("10811510010101", null, english);
		String message1 = messageSource.getMessage("111", null, english);
		return "Hello World!";
	}
}
