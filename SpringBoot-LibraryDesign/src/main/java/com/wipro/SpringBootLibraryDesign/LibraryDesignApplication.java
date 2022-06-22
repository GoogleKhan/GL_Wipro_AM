package com.wipro.SpringBootLibraryDesign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.SpringBootLibraryDesign.model.Address;
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

//		GreatLearning greatLearning = new GreatLearning("SpringBoot", "Backend", "Shadab"); // Constructor Injection
//		System.out.println(greatLearning);
//
//		GreatLearning greatLearning2 = new GreatLearning(); // Setter Injection
//		greatLearning2.setCourseName("Angular");
//		greatLearning2.setCourseType("Frontend");
//		greatLearning2.setInstructorName("Khan");
//		System.out.println(greatLearning2);
//
//		GreatLearning greatLearning3 = new GreatLearning("Mobile App Development");
//		System.out.println(greatLearning3);
//
//		GreatLearning greatLearning4 = new GreatLearning("AWS", "Job Oriented");
//		System.out.println(greatLearning4);

		Address address = Address.builder().city("Lucknow").state("UP").build();

		GreatLearning greatLearning = GreatLearning.builder().courseName("SpringBoot").courseType("Backend")
				.instructorName("Shadab").address(address).build();
		System.out.println(greatLearning);

		GreatLearning greatLearning2 = GreatLearning.builder().build();
		System.out.println(greatLearning2);

		GreatLearning greatLearning3 = GreatLearning.builder().courseName("Mobile App Development").build();
		System.out.println(greatLearning3);

		GreatLearning greatLearning4 = GreatLearning.builder().courseName("AWS").courseType("Job Oriented").build();
		System.out.println(greatLearning4);

	}

}
