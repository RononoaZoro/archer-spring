package com.luo.spring.guides.propertyeditor.annotation;

import com.luo.spring.guides.propertyeditor.domain.PropertyEditorBean;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : archer
 * @date : Created in 2022/12/8 20:00
 * @description :
 */
@Configuration
public class PropertyEditorConfiguration {

    @Bean
    static CustomEditorConfigurer customEditorConfigurer() {
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        PropertyEditorRegistrar[] array = {customPropertyEditorRegistrar()};
        customEditorConfigurer.setPropertyEditorRegistrars(array);
        return customEditorConfigurer;
    }


    @Bean
    static PropertyEditorBean.CustomPropertyEditorRegistrar customPropertyEditorRegistrar() {
        return new PropertyEditorBean.CustomPropertyEditorRegistrar();
    }

}
