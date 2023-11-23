package com.github.ciotobe.ssia.chapter11.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ciotobe.ssia.chapter11.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findUserByUsername(String username);
}
