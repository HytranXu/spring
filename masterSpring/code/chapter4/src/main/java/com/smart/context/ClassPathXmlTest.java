package com.smart.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.smart.Car;

/**
 * Created by xuhc on 2017/10/18.
 */
public class ClassPathXmlTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/smart/context/beans.xml");
        Car car =ctx.getBean("car",Car.class);
    }
}
