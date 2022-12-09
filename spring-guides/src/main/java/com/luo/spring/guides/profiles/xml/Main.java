package com.luo.spring.guides.profiles.xml;

import com.luo.spring.guides.profiles.impl.Food;
import com.luo.spring.guides.profiles.impl.FoodProviderService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

//通过 -Dspring.profiles.active=highschool 指定要读取的配置文件
public class Main {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:profiles/*-config.xml");
        ctx.refresh();

        FoodProviderService foodProviderService =
            ctx.getBean("foodProviderService", FoodProviderService.class);

        List<Food> lunchSet = foodProviderService.provideLunchSet();

        for (Food food: lunchSet) {
            System.out.println("Food: " + food.getName());
        }

        ctx.close();
    }
}
