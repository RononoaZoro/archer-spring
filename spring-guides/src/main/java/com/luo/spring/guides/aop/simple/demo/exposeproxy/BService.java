package com.luo.spring.guides.aop.simple.demo.exposeproxy;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : archer
 * @date : Created in 2023/1/13 17:24
 * @description :
 */
@Service("bService")
public class BService {


    public void c(String source){
        System.out.println(source + ":c");
        ((BService) AopContext.currentProxy()).d("BService");
    }

    private void d(String source) {
        System.out.println(source + ":d");
    }
}
