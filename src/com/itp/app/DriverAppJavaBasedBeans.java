package com.itp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itp.config.AppContext;
import com.itp.model.Engine;

public class DriverAppJavaBasedBeans {

	public static void main(String[] args) {
		
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(AppContext.class);
		Engine myEng1=beanFactory.getBean("e1",Engine.class);
		System.out.println(myEng1);
		
		Engine myEng3=beanFactory.getBean("e1",Engine.class);
		System.out.println(myEng3);
		
		System.out.println(myEng1==myEng3);//false
		
		Engine myEng2=beanFactory.getBean("engineSDI",Engine.class);
		System.out.println(myEng2);

	}

}
