package com.luo.spring.guides.helloworld.tagparsing.bean.lookupmethod;

/**
 * @author : archer
 * @date : Created in 2022/10/14 11:24
 * @description :
 */
public class Student extends User{
    @Override
    public void showMe() {
        System.out.println("i am a student");
    }
}
