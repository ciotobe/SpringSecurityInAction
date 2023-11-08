package com.github.ciotobe.ssia.chapter6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.ciotobe.ssia.chapter6.service.ProductService;

@Controller
public class MainPageController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/main")
	public String main(Authentication a, Model model) {
		model.addAttribute("username", a.getName());
		model.addAttribute("products", productService.findAll());
		return "main.html";
	}
}
