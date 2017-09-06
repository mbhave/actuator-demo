package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public ExampleEndpoint exampleEndpoint() {
		return new ExampleEndpoint();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
