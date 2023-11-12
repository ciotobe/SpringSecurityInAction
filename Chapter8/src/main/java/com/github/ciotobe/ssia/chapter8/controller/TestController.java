package com.github.ciotobe.ssia.chapter8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@PostMapping("/a")
	public String postEndpointA() {
		return "PostEndpointA works!";
	}

	@GetMapping("/a")
	public String getEndpointA() {
		return "GetEndpointA works!";
	}
	
	@GetMapping("/a/b")
	public String getEndpointAB() {
		return "GetEndpointAB works!";
	}
	
	@GetMapping("/a/b/c")
	public String getEndpointABC() {
		return "GetEndpointABC works!";
	}
}
