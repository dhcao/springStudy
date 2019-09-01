package org.dhcao.relax.spring.statictest;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
public class Son1 extends Father {
	@Override
	protected void doSomething() {
		System.out.println("Son1`s doSomething");
		super.doSomething();
	}
}

class Son2 extends Father {
	@Override
	protected void doSomething() {
		System.out.println("Son2`s doSomething");
		super.doSomething();
	}
}

class Father{

	protected void doSomething(){
		System.out.println("Father`s doSomething");
		this.doSomething();
	}

	public static void main(String[] args) {
		Father father = new Son2 ();
		father.doSomething();

	}
}
