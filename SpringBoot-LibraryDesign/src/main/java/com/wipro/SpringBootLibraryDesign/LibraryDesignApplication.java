package com.wipro.SpringBootLibraryDesign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.SpringBootLibraryDesign.model.GreatLearning;

@SpringBootApplication
public class LibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryDesignApplication.class, args);

		System.out.println("SpringBoot Started.....");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello From Run method");
		
//		GreatLearning greatLearning= new GreatLearning("SpringBoot", "Backend", "Shadab");		
//		System.out.println(greatLearning);
//		
//		GreatLearning greatLearning2 = new GreatLearning();
//		greatLearning2.setCourseName("Angular");
//		greatLearning2.setCourseType("Frontend");
//		greatLearning2.setInstructorName("Khan");
//		
//		System.out.println(greatLearning2);

	}

}
