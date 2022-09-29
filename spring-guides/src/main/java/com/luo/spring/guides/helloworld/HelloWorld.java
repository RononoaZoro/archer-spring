package com.luo.spring.guides.helloworld;

import com.luo.spring.guides.helloworld.common.TestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class HelloWorld {

	public static void main(String... args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/app-context.xml"));
		TestBean testBean = (TestBean) beanFactory.getBean("testBean");
		System.out.println(testBean.getTestStr());
	}
}
