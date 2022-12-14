package com.luo.spring.guides.aop.proxyfactorybean.introduction;

import com.luo.spring.guides.aop.proxyfactorybean.introduction.domain.Contact;
import com.luo.spring.guides.aop.proxyfactorybean.introduction.domain.IsModifiedAdvisor;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by iuliana.cosmina on 4/9/17.
 */
@Configuration
public class AppConfig {

	@Bean
	public Contact guitarist() {
		Contact guitarist = new Contact();
		guitarist.setName("John Mayer");
		return guitarist;
	}

	@Bean
	public Advisor advisor() {
		return new IsModifiedAdvisor();
	}

	@Bean
	ProxyFactoryBean bean() {
		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
		proxyFactoryBean.setTarget(guitarist());
		//cglib代理 设置是否直接代理目标类，false表示直接代理特定接口
		proxyFactoryBean.setProxyTargetClass(true);
		proxyFactoryBean.addAdvisor(advisor());
		return proxyFactoryBean;
	}
}
