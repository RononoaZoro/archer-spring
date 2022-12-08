package com.luo.spring.guides.propertyeditor.custom;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport  {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        //匹配任意空白字符（空格，制表符等）
        String[] name = text.split("\\s");

        setValue(new FullName(name[0], name[1]));
    }
}
