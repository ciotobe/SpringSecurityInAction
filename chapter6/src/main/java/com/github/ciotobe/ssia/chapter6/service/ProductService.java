package com.github.ciotobe.ssia.chapter6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.ciotobe.ssia.chapter6.entity.Product;
import com.github.ciotobe.ssia.chapter6.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
}
