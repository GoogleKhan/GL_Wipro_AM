package com.wipro.SpringBootLibraryDesign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.SpringBootLibraryDesign.model.GreatLearning;

@RestController
public class TestController {

	@GetMapping("/info")
	public GreatLearning getModel() {

		GreatLearning greatLearning = new GreatLearning("SpringBoot", "Backend", "Shadab");
		return greatLearning;
	}

	@PostMapping("/custom-info")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		GreatLearning greatLearning = new GreatLearning(courseName, courseType, instructorName);
		return greatLearning;
	}

}
