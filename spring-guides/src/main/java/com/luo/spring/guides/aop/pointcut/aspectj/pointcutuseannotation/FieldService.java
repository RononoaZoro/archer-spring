package com.luo.spring.guides.aop.pointcut.aspectj.pointcutuseannotation;

import org.springframework.stereotype.Service;

/**
 * @author : archer
 * @date : Created in 2023/3/23 15:33
 * @description :
 */
@Service
public class FieldService {

    @EnableMyAnnotation
    public FieldDemo getFieldDemo1() {

        FieldDemo fieldDemo = new FieldDemo();
        fieldDemo.setAaa("bbb");
        return fieldDemo;
    }
}
