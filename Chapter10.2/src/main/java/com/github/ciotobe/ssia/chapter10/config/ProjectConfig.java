package com.github.ciotobe.ssia.chapter10.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

@SuppressWarnings("deprecation")
@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity http) throws Exception{
		http.cors(c -> {
			CorsConfigurationSource source = request -> {
				CorsConfiguration config = new CorsConfiguration();
				
				config.setAllowedOrigins(List.of("http://localhost:8080", "http://127.0.0.1:8080"));
				config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE"));
				
				return config;
			};
			c.configurationSource(source);
		});
		
		http.csrf().disable();
		
		http.authorizeRequests().anyRequest().permitAll();
	}
}
