package com.luo.spring.guides.beanlifecycle.destory.disposable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/8 16:49
 * @description :
 */
public class Main {

    @Configuration
    static class DestructiveBeanConfig {

        @Lazy // 表示 getBean 时再创建 bean
        @Bean
        DestructiveBeanWithInterface destructiveBean() {
            DestructiveBeanWithInterface destructiveBean = new DestructiveBeanWithInterface();
            destructiveBean.setFilePath(System.getProperty("java.io.tmpdir") +
                    System.getProperty("file.separator") + "test.txt");
            return destructiveBean;
        }

    }

    public static void main(String... args) throws Exception {
        GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(DestructiveBeanConfig.class);

        ctx.getBean(DestructiveBeanWithInterface.class);
        ctx.close();
    }
}
