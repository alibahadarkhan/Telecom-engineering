package com.care.telecomEng.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.care.telecomEng.dto.UserDTO;
import com.care.telecomEng.model.Customer;
import com.care.telecomEng.model.Role;
import com.care.telecomEng.model.User;
import com.care.telecomEng.reposityory.CustomerRepository;
import com.care.telecomEng.reposityory.RoleRepository;
import com.care.telecomEng.reposityory.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private CustomerRepository customerRepos;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		   User user = userRepo.findByEmail(username);
	        if (user == null){
	            throw new UsernameNotFoundException("Invalid username or password.");
	        }
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				                                        mapRolesToAuthorities(user.getRoles()));
	}

	@Override
	public User findByEmail(String email) {
		 return userRepo.findByEmail(email);
	}

	@Override
	public User saveUser(UserDTO userDto) {
        User user = new User();
        Customer customer = new Customer();
        customer.setFirstName(userDto.getFirstName());
        customer.setLastName(userDto.getLastName());
        customer.setUser(user);
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setRoles(Arrays.asList(roleRepo.findByRoleNameContainingIgnoreCase("user")));
        user.setCustomer(customer);
        customerRepos.save(customer);
        return user;
	}
	
	 private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
	        return roles.stream()
	                .map(role -> new SimpleGrantedAuthority(role.getRoleName()))
	                .collect(Collectors.toList());
	    }

}
