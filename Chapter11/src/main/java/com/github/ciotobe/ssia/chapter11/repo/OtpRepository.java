package com.github.ciotobe.ssia.chapter11.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ciotobe.ssia.chapter11.entity.Otp;
import com.github.ciotobe.ssia.chapter11.entity.User;

public interface OtpRepository extends JpaRepository<Otp, String> {
	Optional<Otp> findUserByUsername(String username);
}
