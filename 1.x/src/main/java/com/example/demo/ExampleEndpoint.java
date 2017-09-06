package com.example.demo;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;

/**
 * @author Madhura Bhave
 */
public class ExampleEndpoint extends AbstractEndpoint<String> {

	public ExampleEndpoint(String id) {
		super(id, false);
	}

	@Override
	public String invoke() {
		return "hello world";
	}

}
