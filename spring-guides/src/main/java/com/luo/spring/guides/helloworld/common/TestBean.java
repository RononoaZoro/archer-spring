package com.luo.spring.guides.helloworld.common;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author : archer
 * @date : Created in 2022/9/28 17:21
 * @description :
 */
@Data
@ToString
public class TestBean {
    private String testStr;

    private List<String> list;

    public TestBean() {
        this.testStr = "helloworld";
    }
}
