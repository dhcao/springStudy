package org.dhcao.relax.spring.xsd;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class UserBeanDefinitionParse extends AbstractSingleBeanDefinitionParser {

	// element对应的类
	protected Class getBeanClass(Element element){
		return User.class;
	}

	protected void doParse(Element element, BeanDefinitionBuilder bean){
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");

		if (StringUtils.hasText(userName)) {
			bean.addPropertyValue("userName",userName);
		}

		if (StringUtils.hasText(email)) {
			bean.addPropertyValue("email",email);
		}
	}

}
