package com.luo.spring.guides.propertyeditor.annotation;

import com.luo.spring.guides.propertyeditor.domain.PropertyEditorBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;

/**
 * @author : archer
 * @date : Created in 2022/12/8 19:02
 * @description :
 */
public class Main {

    public static void main(String... args) throws Exception {
        File file = File.createTempFile("test", "txt");
        file.deleteOnExit();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:propertyeditor/app-context-propertyeditor-annotation.xml");
        ctx.refresh();

        PropertyEditorBean bean =
                (PropertyEditorBean) ctx.getBean("builtInSample");

        ctx.close();
    }
}
