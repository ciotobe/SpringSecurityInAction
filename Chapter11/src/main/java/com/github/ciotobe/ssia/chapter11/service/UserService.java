package com.github.ciotobe.ssia.chapter11.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.github.ciotobe.ssia.chapter11.entity.Otp;
import com.github.ciotobe.ssia.chapter11.entity.User;
import com.github.ciotobe.ssia.chapter11.repo.OtpRepository;
import com.github.ciotobe.ssia.chapter11.repo.UserRepository;
import com.github.ciotobe.ssia.chapter11.util.GenerateCodeUtil;

@Service
@Transactional
public class UserService {
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OtpRepository otpRepository;
	
	public void addUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		userRepository.save(user);
	}
	
	public void auth(User user) {
		Optional<User> o = userRepository.findUserByUsername(user.getUsername());
		
		if(o.isPresent()) {
			User u = o.get();
			
			if(passwordEncoder.matches(user.getPassword(), u.getPassword())) {
				renewOtp(u);
			}
			else {
				throw new BadCredentialsException("Bad Credentials.");
			}
		}
		else {
			throw new BadCredentialsException("Bad Credentials.");
		}
	}
	
	private void renewOtp(User u) {
		String code = GenerateCodeUtil.generateCode();
		
		Optional<Otp> userOtp = otpRepository.findUserByUsername(u.getUsername());
		
		if(userOtp.isPresent()) {
			Otp otp = userOtp.get();
			otp.setCode(code);
		}
		else {
			Otp otp = new Otp();
			otp.setUsername(u.getUsername());
			otp.setCode(code);
			otpRepository.save(otp);
		}
	}
	
	public boolean check(Otp otpToValidate) {
		Optional<Otp> userOtp = otpRepository.findUserByUsername(otpToValidate.getUsername());
		
		if(userOtp.isPresent()) {
			Otp otp = userOtp.get();
			
			if(otpToValidate.getCode().equals(otp.getCode())) {
				return true;
			}
		}
		
		return false;
	}
}
