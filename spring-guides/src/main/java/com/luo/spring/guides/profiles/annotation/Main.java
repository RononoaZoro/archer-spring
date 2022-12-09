package com.luo.spring.guides.profiles.annotation;

import com.luo.spring.guides.profiles.impl.Food;
import com.luo.spring.guides.profiles.impl.FoodProviderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

/**
 * Created by iuliana.cosmina on 3/18/17.
 */
public class Main {

	public static void main(String... args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(
				KindergartenConfig.class,
				HighschoolConfig.class);

		FoodProviderService foodProviderService =
				ctx.getBean("foodProviderService", FoodProviderService.class);

		List<Food> lunchSet = foodProviderService.provideLunchSet();
		for (Food food : lunchSet) {
			System.out.println("Food: " + food.getName());
		}
		ctx.close();
	}
}
