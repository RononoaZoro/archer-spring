package com.luo.spring.guides.helloworld.tagparsing.customtag;

import lombok.Data;
import lombok.ToString;

/**
 * @author : archer
 * @date : Created in 2022/10/25 20:46
 * @description :
 */
@Data
@ToString
public class User {

    private String userName;
    private String email;
}
