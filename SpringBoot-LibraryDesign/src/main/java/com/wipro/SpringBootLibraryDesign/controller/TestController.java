package com.wipro.SpringBootLibraryDesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.SpringBootLibraryDesign.model.GreatLearning;
import com.wipro.SpringBootLibraryDesign.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/info")
	public GreatLearning getModel() {

		log.info("getModel() started...");

		GreatLearning greatLearning = testService.getModel();

		log.info("getModel() ended...");

		return greatLearning;
	}

	@PostMapping("/custom-info")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {

		log.info("customInfo() started...");

		GreatLearning greatLearning = testService.customInfo(courseName, courseType, instructorName);

		log.info("customInfo() ended...");

		return greatLearning;
	}

}
