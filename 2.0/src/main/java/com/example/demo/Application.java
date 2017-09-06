package com.example.demo;

import com.example.demo.web.ExampleEndpointWebExtension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public ExampleEndpoint exampleEndpoint() {
		return new ExampleEndpoint();
	}
	
	@Bean
	public ExampleEndpointWebExtension exampleEndpointWebExtension(ExampleEndpoint endpoint) {
		return new ExampleEndpointWebExtension(endpoint);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
