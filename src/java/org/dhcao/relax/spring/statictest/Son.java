package org.dhcao.relax.spring.statictest;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class Son extends Parent {

	static {
		System.out.println("Son 静态代码块");
	}

	Son() {
		System.out.println("Son 构造方法");
	}

	public static void main(String[] args) {
		new Son();
		new Son();
	}
}


class Parent {

	static{
		System.out.println("Parent 静态代码块");
	}

	public Parent(){
		System.out.println("Parent 构造方法");
	}
}