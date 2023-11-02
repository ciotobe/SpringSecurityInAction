package com.github.ciotobe.ssia.chapter2.config;

import java.util.Arrays;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = authentication.getName();
		String password = String.valueOf(authentication.getCredentials());
		
		if("john".equals(username) && "12345".equals(password)) {
			return new UsernamePasswordAuthenticationToken(username, password, Arrays.asList());
		}
		else {
			throw new AuthenticationCredentialsNotFoundException("Error!");
		}
	}

	@Override
	public boolean supports(Class<?> authenticationType) {
		// TODO Auto-generated method stub
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authenticationType);
	}
}
