package org.dhcao.relax.spring.beanPostProcessor;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class BeanPostProcessorTest {
    public static void main(String[] args) {
        ConfigurableListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-context2.xml"));
        BeanFactoryPostProcessor bfpp =(BeanFactoryPostProcessor) bf.getBean("bfpp");

        bfpp.postProcessBeanFactory(bf);
        System.out.println(bf.getBean("simpleBean").toString());
    }
}
