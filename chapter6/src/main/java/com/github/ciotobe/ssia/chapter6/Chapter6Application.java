package com.github.ciotobe.ssia.chapter6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Chapter6Application {

	public static void main(String[] args) {
		/**
		 *  to calculate BCrypt value for of the password
		 */
		/*
		 * BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); String
		 * password [] = {"12345"}; for(int i = 0; i < password.length; i++) {
		 * System.out.println(passwordEncoder.encode(password[i])); }
		 */
	    
		SpringApplication.run(Chapter6Application.class, args);
	}

}
