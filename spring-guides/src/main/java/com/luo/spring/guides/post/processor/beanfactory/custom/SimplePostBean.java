package com.luo.spring.guides.post.processor.beanfactory.custom;

import lombok.Data;
import lombok.ToString;

/**
 * @author : archer
 * @date : Created in 2023/1/9 10:41
 * @description :
 */
@ToString
@Data
public class SimplePostBean {

    private String connectionString;
    private String username;
    private String password;
}
