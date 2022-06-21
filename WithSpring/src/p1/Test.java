package p1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		System.out.println("Hello Friends");

//		Engine engine1 = new Engine();
//		Engine engine2 = new Engine();
//
//		Car c1 = new Car(engine1); // constructor dependency

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
