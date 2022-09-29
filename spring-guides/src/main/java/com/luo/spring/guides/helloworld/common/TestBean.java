package com.luo.spring.guides.helloworld.common;

import lombok.Data;

/**
 * @author : archer
 * @date : Created in 2022/9/28 17:21
 * @description :
 */
@Data
public class TestBean {
    private String testStr;

    public TestBean() {
        this.testStr = "helloworld";
    }
}
