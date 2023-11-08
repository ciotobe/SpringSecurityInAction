package com.github.ciotobe.ssia.chapter6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ciotobe.ssia.chapter6.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
