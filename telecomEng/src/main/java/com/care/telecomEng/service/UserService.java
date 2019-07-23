package com.care.telecomEng.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.care.telecomEng.dto.UserDTO;
import com.care.telecomEng.model.User;

public interface UserService extends UserDetailsService {
	
	public User findByEmail(String email);
	public User saveUser(UserDTO userDto);

}
