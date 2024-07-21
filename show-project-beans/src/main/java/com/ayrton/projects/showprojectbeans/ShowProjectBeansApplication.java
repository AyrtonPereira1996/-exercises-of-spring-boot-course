package com.ayrton.projects.showprojectbeans;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan({"com.ayrton.projects.showprojectbeans", "com.ayrton.projects.showprojectbeans.services"})
@SpringBootApplication
public class ShowProjectBeansApplication {
	
	@Bean 
	public Usuarios usuarios() {
		return new Usuarios("Ayrton", "Pereria");
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ShowProjectBeansApplication.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
	 	for(String name : beanNames) {
			System.out.println(name);
		}
	 	
	 	System.out.println(
	 			
	 			ctx.getBean("usuarios").toString()
	 			
	 			);
	}
	
	
	
}
