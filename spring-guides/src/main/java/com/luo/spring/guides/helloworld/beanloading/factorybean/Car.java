package com.luo.spring.guides.helloworld.beanloading.factorybean;

import lombok.Data;
import lombok.ToString;

/**
 * @author : archer
 * @date : Created in 2022/10/28 10:27
 * @description :
 */
@Data
@ToString
public class Car {

    //最大速度
    private int maxSpeed;
    //品牌
    private String brand;
    //价格
    private double price;
}
