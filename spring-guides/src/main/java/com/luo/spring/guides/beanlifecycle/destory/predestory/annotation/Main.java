package com.luo.spring.guides.beanlifecycle.destory.predestory.annotation;

import com.luo.spring.guides.beanlifecycle.destory.predestory.domain.DestructiveBeanWithJSR250;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by iuliana.cosmina on 2/27/17.
 */
public class Main {

	@Configuration
	static class DestructiveBeanConfig {

		@Lazy // 表示 getBean 时再创建 bean
		@Bean
		DestructiveBeanWithJSR250 destructiveBean() {
			DestructiveBeanWithJSR250 destructiveBean = new DestructiveBeanWithJSR250();
			destructiveBean.setFilePath(System.getProperty("java.io.tmpdir") +
					System.getProperty("file.separator") + "test.txt");
			return destructiveBean;
		}

	}

	public static void main(String... args) {
		GenericApplicationContext ctx =
				   new AnnotationConfigApplicationContext(DestructiveBeanConfig.class);

		ctx.getBean(DestructiveBeanWithJSR250.class);
		ctx.registerShutdownHook();
	}

}
