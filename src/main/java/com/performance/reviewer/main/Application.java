package com.performance.reviewer.main;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("${com.performance.reviewer}")
public class Application {

	private static final Logger logger = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
		logger.info("\n\n ************** main entered ************** \n\n");
		SpringApplication.run(Application.class, args);
		logger.info("\n\n ************** main exited ************** \n\n");
	}
}
