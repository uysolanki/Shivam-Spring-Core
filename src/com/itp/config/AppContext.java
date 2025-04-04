package com.itp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.itp.model.Engine;

@Configuration
public class AppContext {
	
	@Bean(name="e1")
	@Scope("prototype")
	public Engine engineCDI()
	{
		Engine myEngine1=new Engine(15,1500, "Petrol", "Honda"); 
		return myEngine1;
	}
	
	@Bean
	public Engine engineSDI()
	{
		Engine myEngine2=new Engine(); 
		myEngine2.setEngineCC(2500);
		myEngine2.setEngineLitre(25);
		myEngine2.setEngineMfgName("Toyota");
		myEngine2.setEngineType("Diesel");
		return myEngine2;
	}

}
