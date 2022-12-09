package com.luo.spring.guides.profiles.impl.kindergarten;

import com.luo.spring.guides.profiles.impl.Food;
import com.luo.spring.guides.profiles.impl.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class KindergartenFoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));

        return lunchSet;
    }
}
