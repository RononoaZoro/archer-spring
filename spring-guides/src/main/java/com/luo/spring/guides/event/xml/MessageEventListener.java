package com.luo.spring.guides.event.xml;

import com.luo.spring.guides.event.domain.MessageEvent;
import org.springframework.context.ApplicationListener;

public class MessageEventListener implements ApplicationListener<MessageEvent> {
    @Override
    public void onApplicationEvent(MessageEvent event) {
        MessageEvent msgEvt = event;
        System.out.println("Received: " + msgEvt.getMessage());
    }
}
