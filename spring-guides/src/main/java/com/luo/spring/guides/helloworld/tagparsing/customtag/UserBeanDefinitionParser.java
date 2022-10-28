package com.luo.spring.guides.helloworld.tagparsing.customtag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author : archer
 * @date : Created in 2022/10/26 16:42
 * @description :
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    public static final String USER_NAME = "userName";
    public static final String EMAIL = "email";

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String userName = element.getAttribute(USER_NAME);
        String email = element.getAttribute(EMAIL);
        if (StringUtils.hasText(userName)) {
            bean.addPropertyValue(USER_NAME, userName);
        }
        if (StringUtils.hasText(email)) {
            bean.addPropertyValue(EMAIL, email);
        }
    }
}
