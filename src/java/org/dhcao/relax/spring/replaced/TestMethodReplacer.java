package org.dhcao.relax.spring.replaced;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class TestMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
		System.out.println("i replaced the original method");
		return null;
	}
}
