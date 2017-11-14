package com.smart.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import com.smart.Car;

/**
 * Created by xuhc on 2017/10/17.
 */
public class GroovyApplicationContextTest {
    public void geBean(){
        ApplicationContext ctx = new GenericGroovyApplicationContext("classpath:com/smart/context/groovy-beans.groovy");
        Car car = (Car)ctx.getBean("car");
    }

    public static void main(String[] args) throws Throwable {
        new GroovyApplicationContextTest().geBean();
    }
}
