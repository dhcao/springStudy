package org.dhcao.relax.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
@Aspect
public class AspectJTest {

    /**
     * 定义一个切点，入口是test方法，不管啥参数都算...
     */
    @Pointcut("execution(* *.test*(..))")
    public void test(){

    }

    /**
     * 引用这个切点
     */
//    @Before("test()")
//    public void beforeTest(){
//        System.out.println("beforeTest");
//    }

//    @After("test()")
//    public void afterTest(){
//        System.out.println("afterTest");
//    }

    @Around("test()")
    public void aroundTest(ProceedingJoinPoint p) throws Throwable {
        System.out.println("before1");

        p.proceed();

        System.out.println("after1");
    }
}
