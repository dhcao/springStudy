package org.dhcao.relax.spring.beanPostProcessor;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.util.StringValueResolver;

/**
 * 实现spring的后处理器；
 * 非必须：可通过实现Ordered来指定顺序，返回值越小越靠前。
 * @Author: dhcao
 * @Version: 1.0
 */
public class ObscenityRemovingFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered {

    private Set<String> obscenties;

    public ObscenityRemovingFactoryPostProcessor() {
        this.obscenties = new HashSet<String>();
    }

    /**
     * 重写后处理器，在bean生成后对bean进行处理
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        String[] beanNames = beanFactory.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
            StringValueResolver valueResolver = new StringValueResolver() {
                @Override
                public String resolveStringValue(String s) {
                    if (isObscene(s)) {
                        return "******";
                    }
                    return s;
                }
            };

            BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
            visitor.visitBeanDefinition(bd);
        }
    }

    public boolean isObscene(Object value){
        String potentialObscenity = value.toString().toUpperCase();
        return this.obscenties.contains(potentialObscenity);
    }

    public void setObscenties(Set<String> obscenties){
        this.obscenties.clear();
        obscenties.forEach(o -> this.obscenties.add(o.toUpperCase()));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
