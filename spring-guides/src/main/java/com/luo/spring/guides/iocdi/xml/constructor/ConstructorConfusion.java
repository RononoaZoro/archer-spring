package com.luo.spring.guides.iocdi.xml.constructor;

/**
 * @author : archer
 * @date : Created in 2022/11/30 14:46
 * @description :
 */
public class ConstructorConfusion {

    private String someValue;

    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    public ConstructorConfusion(int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    public String toString() {
        return someValue;
    }
}
