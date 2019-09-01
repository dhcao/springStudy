package org.dhcao.relax.spring.myApplicationContext;

import java.util.Map;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations ){
        super(configLocations);
    }

    protected void initPropertySources(){
        final Map<String, Object> systemEnvironment = getEnvironment().getSystemEnvironment();

        systemEnvironment.keySet().forEach(x -> System.out.println(x+" : "+systemEnvironment.get(x)));

        final String user = getEnvironment().getProperty("USER");
        if (!"dhcao".equals(user)) {
            throw new RuntimeException("不许用我电脑");
        }

    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.setAllowBeanDefinitionOverriding(false);
        super.setAllowCircularReferences(true);
        super.customizeBeanFactory(beanFactory);
    }
}
