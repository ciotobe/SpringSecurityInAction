package com.github.ciotobe.ssia.chapter10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.csrf.CsrfFilter;

import com.github.ciotobe.ssia.chapter10.filter.CsrfTokenLogger;

@SuppressWarnings("deprecation")
@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public UserDetailsService uds() {
		var uds = new InMemoryUserDetailsManager();
		
		var u1 = User.withUsername("mary")
					 .password("12345")
					 .authorities("READ")
					 .build();
		
		uds.createUser(u1);
		
		return uds;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.anyRequest()
			.authenticated();
		
		http.formLogin()
			.defaultSuccessUrl("/main", true);
	}
}
