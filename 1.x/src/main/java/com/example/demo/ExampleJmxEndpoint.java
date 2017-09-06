package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.boot.actuate.endpoint.jmx.EndpointMBean;
import org.springframework.jmx.export.annotation.ManagedOperation;

/**
 * @author Madhura Bhave
 */
public class ExampleJmxEndpoint extends EndpointMBean {

	public ExampleJmxEndpoint(String beanName, Endpoint<?> endpoint, ObjectMapper
			objectMapper) {
		super(beanName, endpoint, objectMapper);
	}

	@ManagedOperation(description = "Get some value")
	public Object getValue() {
		return convert(getEndpoint().invoke());
	}

	@ManagedOperation(description = "Set some value")
	public void setValue(String value) {
		getEndpoint().setSomeValue(value);
	}

	@Override
	public ExampleEndpoint getEndpoint() {
		return (ExampleEndpoint) super.getEndpoint();
	}
}
