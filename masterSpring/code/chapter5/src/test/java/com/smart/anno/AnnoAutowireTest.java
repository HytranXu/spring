package com.smart.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.*;
import  static  org.testng.Assert.*;

public class AnnoAutowireTest{
	public ApplicationContext factory = null;
	private static String[] CONFIG_FILES = { "com/smart/anno/beans.xml" };

	@BeforeMethod
	public void setUp() throws Exception {
		System.out.println("execute setUp");
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
		System.out.println("finish setUp");
	}

	@Test
	public void testAutoByName(){
		Boss boss = (Boss) factory.getBean("boss");
		assertNotNull(boss);
		System.out.println("boss.car:"+boss.getCar());
		System.out.println("finish testAutoByName");
		((ClassPathXmlApplicationContext)factory).destroy();
	}
}
