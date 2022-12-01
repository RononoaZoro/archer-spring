package com.luo.spring.guides.tagparsing.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author : archer
 * @date : Created in 2022/10/26 16:55
 * @description :
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public static final String USER = "user";

    @Override
    public void init() {
        registerBeanDefinitionParser(USER, new UserBeanDefinitionParser());
    }
}
