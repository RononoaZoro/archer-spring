package com.luo.spring.guides.iocdi.lazyinit.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author : archer
 * @date : Created in 2022/11/30 14:37
 * @description :
 */
@Component
@Lazy
public class Singer {

    private String message = "Default message";

    private Guitar guitar;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Autowired
    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }

    public void sing() {
        guitar.sing();
    }
}
