package com.luo.spring.guides.jsr330;

import javax.inject.Inject;
import javax.inject.Named;

@Named("messageProvider")
public class MessageProvider {
    private String message = "Default message";

    @Inject
    @Named("message")
    public MessageProvider(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
