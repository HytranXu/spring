package com.smart.context;

import com.smart.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by xuhc on 2017/10/18.
 */
public class FileSystemXmlTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("Z:/MasterSpring/code/chapter4/src/main/resources/com/smart/context/beans.xml");
        Car car =ctx.getBean("car",Car.class);
    }
}
