package com.example.demo;

import java.util.Map;

import org.springframework.boot.actuate.endpoint.mvc.AbstractEndpointMvcAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Madhura Bhave
 */
public class ExampleMvcEndpoint extends AbstractEndpointMvcAdapter<ExampleEndpoint> {

	public ExampleMvcEndpoint(ExampleEndpoint
			delegate) {
		super(delegate);
	}

	@GetMapping
	@ResponseBody
	public String get() {
		return "hello web world";
	}

	@PostMapping
	@ResponseBody
	public void set(@RequestBody Map<String, String> body) {
		getDelegate().setSomeValue(body.get("value"));
	}

}
