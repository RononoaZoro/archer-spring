package com.luo.spring.guides.profiles.annotation;


import com.luo.spring.guides.profiles.impl.FoodProviderService;
import com.luo.spring.guides.profiles.impl.highschool.HighSchoolFoodProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by iuliana.cosmina on 3/18/17.
 */
@Configuration
@Profile("highschool")
public class HighschoolConfig {

	@Bean
	public FoodProviderService foodProviderService(){
		return new HighSchoolFoodProviderServiceImpl();
	}
}
