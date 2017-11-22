package com.smart.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.*;

public class AdviceTest {
	@Test
	public void advice() {
		String configPath = "com/smart/advice/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);

		//1. greetingAdvice
		Waiter waiter = (Waiter)ctx.getBean("waiter_greeting");
		waiter.greetTo("John");
		System.out.println("After greetingAdvice\n");

		//2. before and after advice
		waiter = (Waiter)ctx.getBean("waiter_before_and_after");
		waiter.greetTo("John");
		System.out.println("After waiter_before_and_after\n");

		//3. around advice
		waiter = (Waiter)ctx.getBean("waiter_around");
		waiter.greetTo("John");
		System.out.println("After waiter_around\n");
	}
}
