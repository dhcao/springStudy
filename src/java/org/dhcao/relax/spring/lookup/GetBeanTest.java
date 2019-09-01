package org.dhcao.relax.spring.lookup;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public abstract class GetBeanTest {

	public void showMe(){
		this.getBean().showMe();
	}

	public abstract User getBean();
}
