package com.luo.spring.guides.beanlifecycle.destory.destroymethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/8 16:55
 * @description :
 */
public class Main {

    @Configuration
    static class DestructiveBeanConfig {
        @Lazy // 表示 getBean 时再创建 bean
        @Bean(initMethod = "init", destroyMethod = "destroy")
        DestructiveBean destructiveBean() {
            DestructiveBean destructiveBean = new DestructiveBean();
            destructiveBean.setFilePath(System.getProperty("java.io.tmpdir") +
                    System.getProperty("file.separator") + "test.txt");
            return destructiveBean;
        }
    }

    public static void main(String... args) throws Exception {
        GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(DestructiveBeanConfig.class);

        ctx.getBean(DestructiveBean.class);
        ctx.registerShutdownHook();
//        ctx.close();
    }
}
