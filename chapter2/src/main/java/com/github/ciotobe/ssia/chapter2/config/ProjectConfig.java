package com.github.ciotobe.ssia.chapter2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private CustomAuthenticationProvider authenticationProvider;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.authenticationProvider(authenticationProvider);
	}
    
    protected void configure(HttpSecurity http) throws Exception{
    	http.httpBasic();
    	
    	http.authorizeRequests()
    		.anyRequest()
    		.authenticated();
    }
}
