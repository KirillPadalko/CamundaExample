package com.sber.javacamunda.javacamundaTask;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableProcessApplication
@SpringBootApplication
public class JavacamundaTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavacamundaTaskApplication.class, args);
	}

}
