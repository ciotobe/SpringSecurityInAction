package com.github.ciotobe.ssia.chapter10.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;

import com.github.ciotobe.ssia.chapter10.filter.CsrfTokenLogger;

@SuppressWarnings("deprecation")
@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity http) throws Exception{
		http.addFilterAfter(new CsrfTokenLogger(), CsrfFilter.class)
			.authorizeHttpRequests()
			.anyRequest()
			.permitAll();
	}
}
