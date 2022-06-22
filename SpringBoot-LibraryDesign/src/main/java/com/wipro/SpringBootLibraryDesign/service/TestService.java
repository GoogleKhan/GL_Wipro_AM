package com.wipro.SpringBootLibraryDesign.service;

import org.springframework.stereotype.Service;

import com.wipro.SpringBootLibraryDesign.model.GreatLearning;

@Service
public class TestService {

	public GreatLearning getModel() {

		GreatLearning greatLearning = GreatLearning.builder().courseName("SpringBoot").courseType("Backend")
				.instructorName("Shadab").build();
		
		// Some More Complex Computations....
		
		return greatLearning;
	}

	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		GreatLearning greatLearning = GreatLearning.builder().courseName(courseName).courseType(courseType)
				.instructorName(instructorName).build();
		return greatLearning;
	}

}
