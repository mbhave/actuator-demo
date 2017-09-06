package com.example.demo.web;

import com.example.demo.ExampleEndpoint;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;


/**
 * @author Madhura Bhave
 */
@EndpointWebExtension(endpoint = ExampleEndpoint.class)
public class ExampleEndpointWebExtension {

	private final ExampleEndpoint delegate;

	public ExampleEndpointWebExtension(ExampleEndpoint delegate) {
		this.delegate = delegate;
	}

	@ReadOperation
	public WebEndpointResponse<String> read() {
		return new WebEndpointResponse<>("Hello web world");
	}
}
