package com.care.telecomEng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IPConfigurationController {

	@GetMapping(value ="/")
	public String taskPage(Model model) {
		model.addAttribute("message", "this is task app.");
		return "home";
	}

	
}
