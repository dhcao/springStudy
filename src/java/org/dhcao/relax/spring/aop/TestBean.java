package org.dhcao.relax.spring.aop;

import org.springframework.aop.framework.AopContext;

/**
 * 这是个测试类，可以打印test字符
 * @Author: dhcao
 * @Version: 1.0
 */
public class TestBean {

    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void test(){
        System.out.println("test");
//        System.out.println(((TestBean)AopContext.currentProxy()).getClass().getName());
        System.out.println(this.getClass().getName());
//        this.test1();
        ((TestBean)AopContext.currentProxy()).test1();

    }

    public void test1(){
        System.out.println("test1");
    }
}
