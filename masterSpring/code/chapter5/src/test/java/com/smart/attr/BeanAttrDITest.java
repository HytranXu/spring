package com.smart.attr;

import org.testng.annotations.*;
import  static  org.testng.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAttrDITest {
	public ApplicationContext factory = null;
	private static String[] CONFIG_FILES = { "com/smart/attr/beans.xml" };

	@BeforeClass
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
	}

	@Test
	public void testBeanRetrieveCar() {
		Car car = (Car) factory.getBean("car");
		assertNotNull(car);
		System.out.println("testBeanRetrieveCar : "+car + "\n");
	}

	@Test
	public void testBeanRetrieveBoss() {
		Boss boss1 = (Boss) factory.getBean("boss1");
		Boss boss2 = (Boss) factory.getBean("boss2");

		System.out.println("testBeanRetrieveBoss1 : "+boss1+ "\n");
		System.out.println("testBeanRetrieveBoss2 : "+boss2+ "\n");

		assertTrue(boss1.getCar() != boss2.getCar());
	}

	@Test
	public void testBeanRetrieveBoss3() {
		Boss boss3 = (Boss) factory.getBean("boss3");
		assertNotNull(boss3.getCar().getBrand());
		System.out.println("testBeanRetrieveBoss3 : "+boss3+ "\n");
	}

	@Test
	public void testBeanRetrieveBoss1() {
		Boss boss1 = (Boss) factory.getBean("boss1");
		assertNotNull(boss1);
		System.out.println("boss1:"+boss1+ "\n");
	}

	@Test
	public void testBeanRetrieveChildBoss() {
		Boss childBoss = (Boss) factory.getBean("childBoss");
		assertNotNull(childBoss);
		System.out.println("childBoss:"+childBoss+ "\n");
	}

	@Test
	public void testCascadeAttr(){
		SportsCar sportsCar = (SportsCar)factory.getBean("sportsCar");
		System.out.println("SportsCar brand is " + sportsCar.getBrand()+ "\n");
	}

    @Test
    public void testBrand(){
        String brand = (String)factory.getBean("brand");
        System.out.println("Brand is " + brand+ "\n");
    }

    @Test
    public void testField(){
        String myField = (String)factory.getBean("myField");
        System.out.println("myField is " + myField+ "\n");
    }
}
