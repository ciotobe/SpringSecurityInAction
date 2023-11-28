package com.github.ciotobe.ssia.chapter12.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig {
	@Bean
	public ClientRegistrationRepository clientRepository() {
		var c = clientRegistration();
		return new InMemoryClientRegistrationRepository(c);
	}
	
	private ClientRegistration clientRegistration() {
		return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("1c9201f32daf8b145033").clientSecret("344bf95b00e3f1720aabe0430cb4838276f5be75").build();
	}
	
	@SuppressWarnings("removal")
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((authz) -> authz.anyRequest().authenticated()).oauth2Login();
		
		return http.build();
	}
}
