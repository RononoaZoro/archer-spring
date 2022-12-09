package com.luo.spring.guides.profiles.impl.highschool;

import com.luo.spring.guides.profiles.impl.Food;
import com.luo.spring.guides.profiles.impl.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class HighSchoolFoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<>();
        lunchSet.add(new Food("Coke"));
        lunchSet.add(new Food("Hamburger"));
        lunchSet.add(new Food("French Fries"));

        return lunchSet;
    }
}
