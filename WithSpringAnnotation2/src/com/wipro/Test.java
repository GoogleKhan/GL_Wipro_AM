package com.wipro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Car c1 = context.getBean("car", Car.class);
		c1.move();
		System.out.println(c1);

		System.out.println("-------------");

		Car c2 = context.getBean("car", Car.class);
		c2.move();
		System.out.println(c2);

		context.close();
	}

}
