package com.luo.spring.guides.beanloading.circulardependency;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : archer
 * @date : Created in 2022/11/7 19:31
 * @description :
 */
@Data
@Service
public class TestC {

    @Autowired
    private TestA testA;
}
