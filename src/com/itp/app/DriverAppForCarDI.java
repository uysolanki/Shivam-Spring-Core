package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;

public class DriverAppForCarDI {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		Car myCar1 = beanFactory.getBean("car2", Car.class);
		System.out.println(myCar1);
		

	}

}
