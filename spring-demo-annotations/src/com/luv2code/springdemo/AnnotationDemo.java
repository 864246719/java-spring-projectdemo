package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
//		Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
		Coach theCoach=context.getBean("tennisCoach",Coach.class);//TennisCoach.class СдtennisCoach
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDayilyFortune());
		//close the context
		context.close();
	}

}
