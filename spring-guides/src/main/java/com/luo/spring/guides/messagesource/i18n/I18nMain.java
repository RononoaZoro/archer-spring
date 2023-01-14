package com.luo.spring.guides.messagesource.i18n;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Properties;

/**
 * @author : archer
 * @date : Created in 2023/1/9 16:25
 * @description :
 */
@Slf4j
public class I18nMain {
    public static void main(String[] args) {
        String[] configs = {"i18n/i18n.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configs);
        String usStr = applicationContext.getMessage("test", null, Locale.US);
        String cnStr = applicationContext.getMessage("test", null, Locale.CHINA);
        System.out.println(cnStr);
        System.out.println(usStr);

        //这种方式中文不需要转 ascii码
        Properties properties = new Properties();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ClassPathResource("message_zh_CN.properties").getInputStream()))) {
            properties.load(bufferedReader);
            log.info("load local classpath file : {} success !", properties);
        } catch (IOException e) {
            log.warn("load file : {} fail ! may be file not exists", properties);
        }
    }
}
