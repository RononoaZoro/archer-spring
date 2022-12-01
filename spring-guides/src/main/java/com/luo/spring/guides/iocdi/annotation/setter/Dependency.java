package com.luo.spring.guides.iocdi.annotation.setter;

import org.springframework.stereotype.Component;

@Component("dependency")
public class Dependency {

    @Override
    public String toString() {
        return "Dependency{}";
    }
}
