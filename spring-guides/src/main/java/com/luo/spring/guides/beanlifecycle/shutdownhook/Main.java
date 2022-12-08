package com.luo.spring.guides.beanlifecycle.shutdownhook;

import com.luo.spring.guides.beanlifecycle.destory.destroymethod.DestructiveBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : archer
 * @date : Created in 2022/12/8 17:11
 * @description :
 */
public class Main {

    @Configuration
    static class DestructiveBeanConfig {
        @Lazy // 表示 getBean 时再创建 bean
        @Bean
        DestructiveBeanWithHook destructiveBean() {
            DestructiveBeanWithHook destructiveBean = new DestructiveBeanWithHook();
            destructiveBean.setFilePath(System.getProperty("java.io.tmpdir") +
                    System.getProperty("file.separator") + "test.txt");
            return destructiveBean;
        }
    }

    public static void main(String... args) throws Exception {
        GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(DestructiveBeanConfig.class);

        ctx.getBean(DestructiveBeanWithHook.class);
    }
}
