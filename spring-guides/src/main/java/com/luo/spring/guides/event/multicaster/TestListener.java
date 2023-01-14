package com.luo.spring.guides.event.multicaster;

import org.springframework.context.ApplicationListener;

/**
 * @author : archer
 * @date : Created in 2023/1/9 18:07
 * @description :
 */
public class TestListener implements ApplicationListener<TestEvent> {

    @Override
    public void onApplicationEvent(TestEvent event) {
        event.print();
    }
}
