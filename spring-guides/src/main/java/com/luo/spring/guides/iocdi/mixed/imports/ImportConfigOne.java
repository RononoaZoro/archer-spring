package com.luo.spring.guides.iocdi.mixed.imports;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : archer
 * @date : Created in 2022/12/9 15:29
 * @description :
 */
@Configuration
@ComponentScan(basePackages={"com.luo.spring.guides.iocdi.mixed.multiple"})
public class ImportConfigOne {
}
