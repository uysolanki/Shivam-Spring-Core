package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Engine;
import com.itp.model.Gear;
import com.itp.model.Player;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
	
		
//		Engine myEngine1=(Engine)beanFactory.getBean("e1");
//		System.out.println(myEngine1);
//		
//		Gear myGear1=beanFactory.getBean("g1", Gear.class);
//		System.out.println(myGear1);
//		
//		Engine myEngine2=(Engine)beanFactory.getBean("e2");
//		System.out.println(myEngine2);
//		
//		Gear myGear2=beanFactory.getBean("g2", Gear.class);
//		System.out.println(myGear2);
		
		System.out.println("Hiiiii");
		
		Player Shivam=beanFactory.getBean("p1", Player.class);
		System.out.println(Shivam);
		
		Player Uday=beanFactory.getBean("p1", Player.class);
		System.out.println(Uday);
		
		Player Aditya=beanFactory.getBean("p1", Player.class);
		System.out.println(Aditya);
		
		System.out.println(Shivam==Uday);
		//System.out.println(Shivam.getPlayerName() + " has scored " + Shivam.getCenturies().get("test") + " centuties in Tests" );
	}

}

//Engine All Args constructor called
//Hiiiii
//Player No Args Constructor Called
//VK record
//Player No Args Constructor Called
//Vk record
//Player No Args Constructor Called
//VK record
//false