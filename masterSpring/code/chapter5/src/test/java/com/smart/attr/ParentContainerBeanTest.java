package com.smart.attr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.*;
import  static  org.testng.Assert.*;

public class ParentContainerBeanTest {
	@Test
	public void parent(){
		ClassPathXmlApplicationContext pFactory = new ClassPathXmlApplicationContext(new String[]{"com/smart/attr/beans1.xml"});
		Boss boss = (Boss)pFactory.getBean("boss");
		assertNotNull(boss);
		System.out.println(boss.getCar().toString());
		ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"com/smart/attr/beans2.xml"},pFactory);
		boss = (Boss)factory.getBean("boss");
		assertNotNull(boss);
		System.out.println(boss.getCar().toString());
	}
}
