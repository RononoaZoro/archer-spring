package com.luo.spring.guides.propertyeditor.custom;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : archer
 * @date : Created in 2022/12/16 15:17
 * @description :
 */
public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        registry.registerCustomEditor(Date.class,
                new CustomDateEditor(dateFormatter, true));
    }
}
