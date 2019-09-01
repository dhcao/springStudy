package org.dhcao.relax.spring.xsd;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new UserBeanDefinitionParse());
	}
}
