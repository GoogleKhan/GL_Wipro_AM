package com.greatlearning.security;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootSecurityApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);

		log.info("Its Working...");
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
	}

}
