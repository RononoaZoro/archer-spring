package com.luo.spring.guides.iocdi.mixed;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : archer
 * @date : Created in 2022/12/1 13:53
 * @description :
 */
@ImportResource(locations = {"classpath:iocdi/injection/mixed/app-context-xml.xml"})
@Configuration
public class MixedConfiguration {
}
