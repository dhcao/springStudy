package org.dhcao.relax.spring.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
@Component("aservice")
public class AServiceImpl implements AService {

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void a() {
        // 此处用的是this，而不是代理类proxy。所以b方法不会使用代理
        System.out.println(this.getClass().getName());
        System.out.println(AopContext.currentProxy().getClass().getName());
        this.b();

        // 这样就可以了
//        ((AService) AopContext.currentProxy()).b();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void b() {
        System.out.println(AopContext.currentProxy().getClass().getName());
        System.out.println(this.getClass().getName());
    }
}
