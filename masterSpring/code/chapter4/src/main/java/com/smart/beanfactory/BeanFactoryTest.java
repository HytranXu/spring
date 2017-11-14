package com.smart.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import com.smart.Car;

/**
 * Created by xuhc on 2017/10/17.
 */
public class BeanFactoryTest {
    public void getBean() throws Throwable
    {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:com/smart/beanfactory/beans.xml");
        System.out.println(res.getURI());

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        System.out.println("Init BeanFactory");

        Car car = factory.getBean("car",Car.class);
        System.out.println("Car bean is ready for use!");
        car.introduce();
    }

    public static void main(String[] args) throws Throwable {
        new BeanFactoryTest().getBean();
    }
}
