package com.github.ciotobe.ssia.chapter6.service;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.github.ciotobe.ssia.chapter6.entity.User;
import com.github.ciotobe.ssia.chapter6.model.CustomUserDetails;
import com.github.ciotobe.ssia.chapter6.repository.UserRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Supplier<UsernameNotFoundException> s = () -> new UsernameNotFoundException("Problem during authentication!");
		
		User u = userRepository.findUserByUsername(username).orElseThrow(s);
		
		return new CustomUserDetails(u);
	}

}
