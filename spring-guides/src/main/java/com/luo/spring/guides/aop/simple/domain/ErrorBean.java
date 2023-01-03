package com.luo.spring.guides.aop.simple.domain;

public class ErrorBean {
    public void errorMethod() throws Exception {
        throw new Exception("Generic Exception");
    }

    public void otherErrorMethod() throws IllegalArgumentException {
        throw new IllegalArgumentException("IllegalArgument Exception");
    }
}
