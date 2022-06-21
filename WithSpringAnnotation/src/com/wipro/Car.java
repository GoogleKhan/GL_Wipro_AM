package com.wipro;

public class Car {

	Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// Constructor
	public Car(Engine engine) {
		this.engine = engine;
	}

	// Setter
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void move() {
		engine.start();
	}

}
