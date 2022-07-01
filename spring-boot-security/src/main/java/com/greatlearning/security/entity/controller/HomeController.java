package com.greatlearning.security.entity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String greet() {
		return "<h1>Hello From GreatLearning</h1>";
	}

}
