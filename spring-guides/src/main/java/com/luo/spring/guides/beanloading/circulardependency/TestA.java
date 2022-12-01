package com.luo.spring.guides.beanloading.circulardependency;

import lombok.Data;

/**
 * @author : archer
 * @date : Created in 2022/11/7 19:30
 * @description :
 */
@Data
//@Service
public class TestA {
//    @Autowired
    private TestB testB;

    public void test(){
        System.out.println("i am testA");
    }
}
