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
@Service("aService")
public class AServiceImpl implements AService {

    @Autowired
    private AService aService;

    @Autowired
    private BService bService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void a(String source) {
        System.out.println(source + ":a");
//        aService.b();
        ((AService) AopContext.currentProxy()).b("AService");
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void b(String source) {
        System.out.println(source + ":b");
        bService.c("BService");
    }

}
