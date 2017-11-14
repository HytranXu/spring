package com.smart.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.smart.Car;
import org.springframework.core.Ordered;

public class MyBeanPostProcessor implements BeanPostProcessor,Ordered{
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {		
		if(beanName.equals("car")){
			Car car = (Car)bean;
			if(car.getMaxSpeed() >= 200){
				System.out.println("调用MyBeanPostProcessor.postProcessAfterInitialization()，将maxSpeed调整为200。");
				car.setMaxSpeed(200);
			}
		}
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {		
		if(beanName.equals("car")){
			Car car = (Car)bean;
			if(car.getColor() == null){
				System.out.println("调用MyBeanPostProcessor.postProcessBeforeInitialization()，color为空，设置为默认黑色。");
				car.setColor("黑色");
			}
		}
		return bean;
	}

	public int getOrder() {
		return 0;
	}
}
