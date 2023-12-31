package com.github.ciotobe.ssia.chapter5.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}
	
	@RequestMapping("/bye")
	@Async
	public String goodbye() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication a = context.getAuthentication();
		
		return "Goodbye, " + a.getName() + "!";
	}
}
