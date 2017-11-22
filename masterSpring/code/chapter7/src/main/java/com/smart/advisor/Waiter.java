package com.smart.advisor;

import com.smart.aop.BeanSelfProxyAware;

public class Waiter implements BeanSelfProxyAware {
	private Waiter waiter = null;

	public void setSelfProxy(Object object) {
		waiter = (Waiter)object;
	}

	public void serveTo(String name){
		System.out.println("waiter serving "+name+"...");
		if(null != waiter) {
			System.out.println("\nWaiter greetTo iteself");
			waiter.greetTo(name);
			System.out.println("End Waiter greetTo iteself\n");
		}
	}

	public void greetTo(String name) {
		System.out.println("waiter greet to "+name+"...");
	}
}
