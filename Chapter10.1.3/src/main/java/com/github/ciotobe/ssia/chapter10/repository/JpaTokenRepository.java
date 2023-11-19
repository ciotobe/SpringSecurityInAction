package com.github.ciotobe.ssia.chapter10.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ciotobe.ssia.chapter10.entity.Token;

public interface JpaTokenRepository extends JpaRepository<Token, Integer> {
	Optional<Token> findTokenByIdentifier(String identifier);
}
