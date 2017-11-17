package com.smart.place;

import java.sql.Connection;

import javax.sql.DataSource;

import com.smart.placeholder.MyDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class PlaceHolderTest {
	String resourceFile = "com/smart/placeholder/beans.xml";
	ApplicationContext ctx = null;

	@BeforeTest
	public void Init()
	{
		ctx = new ClassPathXmlApplicationContext(resourceFile);
	}

	@Test
	public void testDataSource() throws Throwable {
		DataSource ds = ctx.getBean(DataSource.class);
		Connection conn = ds.getConnection();
		assertNotNull(conn);
	}

	@Test
	public void testMyDataSource() throws Throwable {
		System.out.println(ctx.getBean(MyDataSource.class));
	}
}
