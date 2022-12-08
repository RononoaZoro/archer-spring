package com.luo.spring.guides.propertyeditor.custom;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/8 19:03
 * @description :
 */
public class CustomEditorExample {

    private FullName name;

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:propertyeditor/app-context-02.xml");
        ctx.refresh();

        CustomEditorExample bean =
                (CustomEditorExample) ctx.getBean("exampleBean");

        System.out.println(bean.getName());

        ctx.close();
    }
}
