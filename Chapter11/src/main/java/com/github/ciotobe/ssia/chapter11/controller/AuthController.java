package com.github.ciotobe.ssia.chapter11.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.ciotobe.ssia.chapter11.entity.Otp;
import com.github.ciotobe.ssia.chapter11.entity.User;
import com.github.ciotobe.ssia.chapter11.service.UserService;

@RestController
public class AuthController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user/add")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PostMapping("/user/auth")
	public void auth(@RequestBody User user) {
		userService.auth(user);
	}
	
	@PostMapping("/otp/check")
	public void check(@RequestBody Otp otp, HttpServletResponse response) {
		if(userService.check(otp)) {
			response.setStatus(HttpServletResponse.SC_OK);
		}
		else {
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		}
	}
}
