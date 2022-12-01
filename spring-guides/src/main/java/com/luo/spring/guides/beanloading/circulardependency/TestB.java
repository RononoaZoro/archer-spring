package com.luo.spring.guides.beanloading.circulardependency;

import lombok.Data;

/**
 * @author : archer
 * @date : Created in 2022/11/7 19:31
 * @description :
 */
@Data
//@Service
public class TestB {

//    @Autowired
    private TestC testC;
}
