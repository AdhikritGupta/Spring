package com.realWorldApplication;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessCalculationService{
	DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
}

@Configuration
@ComponentScan //Performs component scan on the current package
public class RealWorldSpringContextLauncherApplication {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new 		AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(s -> System.out.println(s));
			
			
		}
	}
}


