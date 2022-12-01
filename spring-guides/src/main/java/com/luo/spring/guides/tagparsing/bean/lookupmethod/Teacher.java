package com.luo.spring.guides.tagparsing.bean.lookupmethod;

/**
 * @author : archer
 * @date : Created in 2022/10/14 11:05
 * @description :
 */
public class Teacher extends User{
    @Override
    public void showMe() {
        System.out.println("i am a teacher");
    }
}
