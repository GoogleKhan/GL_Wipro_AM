package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine engine; // Field-level dependency injection

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
