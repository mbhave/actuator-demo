package com.example.demo;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Madhura Bhave
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.requestMatchers(EndpointRequest.to(HealthEndpoint.class, InfoEndpoint.class))
					.permitAll()
				.requestMatchers(EndpointRequest.toAnyEndpoint())
					.hasAnyRole("ADMIN")
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations())
					.permitAll()
				.anyRequest()
					.authenticated()
				.and()
			.formLogin();
	}
}
