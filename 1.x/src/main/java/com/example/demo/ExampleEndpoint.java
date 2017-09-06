package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;

/**
 * @author Madhura Bhave
 */
public class ExampleEndpoint extends AbstractEndpoint<String> {

	private static final Log logger = LogFactory.getLog(ExampleEndpoint.class);

	public ExampleEndpoint(String id) {
		super(id, false);
	}

	@Override
	public String invoke() {
		return "hello world";
	}

	public void setSomeValue(String value) {
		logger.info("set value " + value);
	}

}
