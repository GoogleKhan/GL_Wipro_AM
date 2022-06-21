package com.wipro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.wipro" })
public class SpringConfig {

	@Bean(name = "car")
	Car getCar() {

		Car car = new Car(getEngine());

		return car;
	}

	@Bean("engine")
	Engine getEngine() {

		Engine engine = new Engine();

		return engine;
	}

}
