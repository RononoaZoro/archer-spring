package com.luo.spring.guides.iocdi.domain;

/**
 * @author : archer
 * @date : Created in 2022/11/30 14:37
 * @description :
 */
public class Singer {

    private String message = "Default message";

    private Guitar guitar;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }

    public void sing() {
        guitar.sing();
    }
}
