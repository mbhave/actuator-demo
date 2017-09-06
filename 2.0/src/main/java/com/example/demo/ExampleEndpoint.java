package com.example.demo;


import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

/**
 * @author Madhura Bhave
 */
@Endpoint(id = "example")
public class ExampleEndpoint {

	private static final Log logger = LogFactory.getLog(ExampleEndpoint.class);

	@ReadOperation
	public String read() {
		return "hello world";
	}

	@WriteOperation
	public void write(String value) {
		logger.info("set value " + value);
	}

}
