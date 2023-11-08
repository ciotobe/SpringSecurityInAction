package com.github.ciotobe.ssia.chapter6.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ciotobe.ssia.chapter6.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findUserByUsername(String u);
}
