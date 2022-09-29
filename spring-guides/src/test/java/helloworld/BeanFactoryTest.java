package helloworld;

import com.luo.spring.guides.helloworld.common.TestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : archer
 * @date : Created in 2022/9/28 17:41
 * @description :
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanfactory-test.xml"));
        TestBean testBean = (TestBean) beanFactory.getBean("testBean");
        assertEquals("helloworld", testBean.getTestStr());
    }
}
