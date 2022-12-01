package com.luo.spring.guides.beanloading.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author : archer
 * @date : Created in 2022/10/28 10:28
 * @description :
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.parseInt(infos[1]));
        car.setPrice(Double.parseDouble(infos[2]));
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public String getCarInfo() {
        return carInfo;
    }

    //接受逗号分隔符设置属性信息，并且顺序固定是 brand，maxSpeed，price
    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
