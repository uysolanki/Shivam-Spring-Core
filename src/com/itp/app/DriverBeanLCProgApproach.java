package com.itp.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Player;

public class DriverBeanLCProgApproach {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		
		System.out.println("Hiiiii");
		
		Player Shivam=beanFactory.getBean("p1", Player.class);
		System.out.println(Shivam);
		
		AbstractApplicationContext abs=( AbstractApplicationContext) beanFactory;
		abs.registerShutdownHook();


	}

}


//Hiii
//Player No Args Constructor Called
//Invoked immediately after constructor
//call To String 