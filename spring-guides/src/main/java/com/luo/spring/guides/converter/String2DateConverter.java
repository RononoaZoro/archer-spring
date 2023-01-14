package com.luo.spring.guides.converter;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : archer
 * @date : Created in 2023/1/9 20:21
 * @description :
 */
public class String2DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return dateFormatter.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
