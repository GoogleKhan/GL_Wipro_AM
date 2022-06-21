package com.greatlearning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		SportCoach  spCoach1=	context.getBean("cricketCoach", SportCoach.class);		
		System.out.println(spCoach1.getTrainingSchedule());
		System.out.println(spCoach1.getAdvice());
		
		System.out.println("----------------------------------------------------");
		
		SportCoach  spCoach2=	context.getBean("footballCoach", SportCoach.class);		
		System.out.println(spCoach2.getTrainingSchedule());
		System.out.println(spCoach2.getAdvice());
		
		
		context.close();
	}

}
