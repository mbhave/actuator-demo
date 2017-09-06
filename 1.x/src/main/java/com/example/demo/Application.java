package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ExampleEndpoint exampleEndpoint() {
		return new ExampleEndpoint("example");
	}

	@Bean
	public ExampleMvcEndpoint exampleMvcEndpoint(ExampleEndpoint exampleEndpoint) {
		return new ExampleMvcEndpoint(exampleEndpoint);
	}

	@Bean
	public ExampleJmxEndpoint exampleJmxEndpoint(ExampleEndpoint exampleEndpoint) {
		return new ExampleJmxEndpoint("exampleEndpoint", exampleEndpoint, new ObjectMapper());
	}

	@Bean
	public ResourceConfig resourceConfig() {
		return new ResourceConfig();
	}
}
