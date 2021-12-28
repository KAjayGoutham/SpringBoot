package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringBootApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(LearningSpringBootApplication.class, args);

		Employee e = context.getBean(Employee.class);
		e.message("Hello");



	}

}
