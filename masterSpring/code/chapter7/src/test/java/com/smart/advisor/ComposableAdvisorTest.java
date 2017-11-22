package com.smart.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.*;
public class ComposableAdvisorTest {
	@Test
	public void composable(){
		String configPath = "com/smart/advisor/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);

		Waiter waiter = (Waiter) ctx.getBean("waiter4");
		waiter.serveTo("Peter");
		waiter.greetTo("Peter");

		WaiterDelegate wd = new WaiterDelegate();
		wd.setWaiter(waiter);
		wd.service("Peter");
	}
}
