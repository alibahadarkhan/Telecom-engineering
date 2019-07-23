package com.care.telecomEng.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.care.telecomEng.dto.UserDTO;
import com.care.telecomEng.model.User;
import com.care.telecomEng.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/signUp")
	public String signUp(Model model) {
		model.addAttribute("userDto", new UserDTO());
		return "registration";
	}

	@PostMapping("/registration")
	public String registration(@ModelAttribute("userDto") @Valid UserDTO userDto, 
            BindingResult result) {
		
	        User existing = userService.findByEmail(userDto.getEmail());
	        if (existing != null){
	            result.rejectValue("email", null, "There is already an account registered with that email");
	        }

	        if (result.hasErrors()){
	            return "registration";
	        }

	        userService.saveUser(userDto);
		return "redirect:/signUp?success";
	}

}
