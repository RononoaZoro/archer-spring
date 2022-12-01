package com.luo.spring.guides.iocdi.xml.setter;

public class Dependency {

    private String message = "i am Dependency";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Dependency{}";
    }
}
