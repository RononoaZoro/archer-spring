package com.luo.spring.guides.jsr330;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : archer
 * @date : Created in 2022/12/9 18:22
 * @description :
 */
@ComponentScan(basePackages = {"com.luo.spring.guides.jsr330"})
@Configuration
public class Jsr330Config {

    @Bean
    String message(){
        return "Gravity is working against me";
    }
}
