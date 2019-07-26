package com.care.telecomEng.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.telecomEng.dto.IpPlaningDTO;
import com.care.telecomEng.model.IpPlaning;
import com.care.telecomEng.service.IpPlaningService;
import com.care.telecomEng.util.Constant;

@Controller
@RequestMapping("/ip/configuration/")
public class IPConfigurationController {
	
	@Autowired
	private IpPlaningService ipService;


	@GetMapping(value ="ipPlaning")
	public String ipConfig(Model model) {
		model.addAttribute("ipPlaningDto", new IpPlaningDTO());
		return Constant.IP_PLANING;
	}
	
	@PostMapping(value ="addIpConfiguration")
	public String addIpPlaning(@ModelAttribute ("ipPlaning") @Valid IpPlaningDTO ipPlaningDto,
			                   BindingResult result) {
		
		if(result.hasErrors()) {
			return Constant.IP_PLANING;
		}
		ipService.save(ipPlaningDto);
		return Constant.REDRIECT_IP_PLANING_SUCCESS;
	}
	
	@PutMapping(value ="updateIpConfiguration")
	public String updateIpPlaning(@ModelAttribute ("ipPlaning") @Valid IpPlaningDTO ipPlaningDto,
			                     BindingResult result) {
		if(result.hasErrors()) {
			return Constant.IP_PLANING;
		}
		ipService.update(ipPlaningDto);
		
		return Constant.IP_PLANING;
	}
	@GetMapping(value ="deleteIpPlaning/{id}")
	public String deleteIpConfig(@PathVariable("id") Long id) {
		ipService.delete(id);
		return Constant.IP_PLANING;
	}
	
	@GetMapping(value ="getIpPlaning/{id}")
	public String getIpConfig(@PathVariable("id") Long id,Model model) {
		model.addAttribute("ipPlaningDto", ipService.getById(id));
		return Constant.IP_PLANING;
	}
	
}
