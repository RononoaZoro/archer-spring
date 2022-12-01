package com.luo.spring.guides.iocdi.alias.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : archer
 * @date : Created in 2022/11/30 19:19
 * @description :
 */
public class AliasConfig {

    @Configuration
    static class AliasBeanConfig {

        @Bean(name = {"johnMayer", "john", "jonathan", "johnny"})
        public Singer singer() {
            return new Singer();
        }
    }
}
