package com.luo.spring.guides.propertyeditor.custom;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport  {
    private String format = "yyyy-MM-dd";

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(format);
        try {
            Date d = dateFormatter.parse(text);
            this.setValue(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
