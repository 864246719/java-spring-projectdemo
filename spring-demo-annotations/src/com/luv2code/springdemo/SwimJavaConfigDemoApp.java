package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
//		Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);//TennisCoach.class СдtennisCoach
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDayilyFortune());
		
		//call out new swim coach methods ...has the props values injected
		System.out.println("email:"+theCoach.getEmail());
		System.out.println("team:"+theCoach.getTeam());
		
		
		
		//close the context
		context.close();
	}

}
