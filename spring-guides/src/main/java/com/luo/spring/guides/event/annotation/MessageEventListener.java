package com.luo.spring.guides.event.annotation;

import com.luo.spring.guides.event.domain.MessageEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author : archer
 * @date : Created in 2022/12/9 11:35
 * @description :
 */
@Component
public class MessageEventListener {

    @EventListener(classes = {MessageEvent.class})
    public void messageEventListener(MessageEvent messageEvent){
        System.out.println("Received: " + messageEvent.getMessage());
    }
}
