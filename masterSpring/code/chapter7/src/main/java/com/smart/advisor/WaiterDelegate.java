package com.smart.advisor;

public class WaiterDelegate {
	private Waiter waiter;

	public void service(String clientName) {
		System.out.println("In WaiterDelegate::service begin greetTo");
		waiter.greetTo(clientName);
		System.out.println("In WaiterDelegate::service begin serveTo");
		waiter.serveTo(clientName);
		System.out.println("End WaiterDelegate::service\n");
	}

	public void setWaiter(Waiter waiter) {
		this.waiter = waiter;
	}
}
