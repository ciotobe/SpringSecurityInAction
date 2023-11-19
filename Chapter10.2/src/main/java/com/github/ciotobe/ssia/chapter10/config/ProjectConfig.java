package com.github.ciotobe.ssia.chapter10.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable();
		
		http.authorizeRequests().anyRequest().permitAll();
	}
}
