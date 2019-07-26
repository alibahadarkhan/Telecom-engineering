package com.care.telecomEng.service;

import java.util.List;

import com.care.telecomEng.dto.IpPlaningDTO;

public interface IpPlaningService extends GenericService<IpPlaningDTO> {
	
	List<IpPlaningDTO> getAll();

}
