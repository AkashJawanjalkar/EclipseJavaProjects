package com.org.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestAppApplication {

	public static void main(String[] args) {
		System.out.println("Its Running...!");
		SpringApplication.run(TestAppApplication.class, args);
	}

}
