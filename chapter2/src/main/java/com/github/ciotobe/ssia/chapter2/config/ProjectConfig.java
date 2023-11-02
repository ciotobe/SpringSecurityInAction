package com.github.ciotobe.ssia.chapter2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SuppressWarnings("deprecation")
@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		var userDetailsService = new InMemoryUserDetailsManager();
		
		var user = User.withUsername("john")
					   .password("12345")
					   .authorities("read")
					   .build();
		
		userDetailsService.createUser(user);
		
		auth.userDetailsService(userDetailsService).passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
    
    protected void configure(HttpSecurity http) throws Exception{
    	http.httpBasic();
    	
    	http.authorizeRequests()
    		.anyRequest()
    		.authenticated();
    }
}
