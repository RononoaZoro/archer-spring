package com.luo.spring.guides.jsr330;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named("messageRenderer")
@Singleton
public class MessageRenderer {
    @Inject
    @Named("messageProvider")
    private MessageProvider messageProvider = null;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                "You must set the property messageProvider of class:"
                + MessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
