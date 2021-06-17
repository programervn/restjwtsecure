package com.thaipd.restjwtsecure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
ref: https://bezkoder.com/spring-boot-jwt-authentication/
 */
@SpringBootApplication
public class RestjwtsecureApplication {
	private static final Logger logger = LoggerFactory.getLogger(RestjwtsecureApplication.class);
	public static void main(String[] args) {
		logger.info("Application is starting ...");
		SpringApplication.run(RestjwtsecureApplication.class, args);
	}
}