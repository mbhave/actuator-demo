package com.example.demo;

import com.example.demo.web.ExampleEndpointWebExtension;
import org.glassfish.jersey.server.ResourceConfig;

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

	@Bean
	public ResourceConfig resourceConfig() {
		return new ResourceConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
