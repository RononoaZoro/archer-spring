package com.luo.spring.guides.converter;

import com.luo.spring.guides.event.multicaster.TestEvent;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;

/**
 * @author : archer
 * @date : Created in 2023/1/9 20:32
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("converter/converter.xml");
        DateBean dateBean = (DateBean) ctx.getBean("dateBean");
        System.out.println(dateBean.getDate());
    }

//    public static void main(String[] args) {
//        DefaultConversionService conversionService = new DefaultConversionService();
//        conversionService.addConverter(new String2DateConverter());
//
//        String time = "2023-01-09 20:34:45";
//        Date date = conversionService.convert(time, Date.class);
//        System.out.println(date.toString());
//    }
}
