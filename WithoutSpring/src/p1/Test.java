package p1;

public class Test {

	public static void main(String[] args) {

		System.out.println("Hello Friends");

		Engine engine1 = new Engine();
		Engine engine2 = new Engine();

		Car c1 = new Car(engine1); // constructor dependency
		c1.move();

		System.out.println("-------------");

		Car c2 = new Car();
		c2.setEngine(engine2); // setter Dependency
		c2.move();
	}

}
