package com.care.telecomEng.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.telecomEng.dto.IpPlaningDTO;
import com.care.telecomEng.model.IpPlaning;
import com.care.telecomEng.reposityory.IpPlaningRepository;
import com.care.telecomEng.util.Util;

@Service
public class IpPlaningServiceImpl implements IpPlaningService {
	
	@Autowired
	private IpPlaningRepository ipPlaningRepos;

	@Override
	public IpPlaningDTO save(IpPlaningDTO dto) {
		IpPlaning ipPlaning = new IpPlaning();
		BeanUtils.copyProperties(dto, ipPlaning);
		ipPlaningRepos.save(ipPlaning);
		dto.setId(ipPlaning.getId());
		
		return dto;
	}

	@Override
	public IpPlaningDTO update(IpPlaningDTO dto) {
		IpPlaning ipPlaning = getIpPlaningById(dto.getId());
		BeanUtils.copyProperties(dto, ipPlaning);
		ipPlaningRepos.save(ipPlaning);
		return null;
	}

	@Override
	public void delete(Long id) {
		IpPlaning ipPlaning = getIpPlaningById(id);
		ipPlaningRepos.deleteById(ipPlaning.getId());
	}

	@Override
	public IpPlaningDTO getById(long id) {
		return mapIpPlaningDto(getIpPlaningById(id));
	}
	
	@Override
	public List<IpPlaningDTO> getAll() {
		List<IpPlaning> list = (List<IpPlaning>) ipPlaningRepos.findAll();
		List<IpPlaningDTO> ipPlaningDTOs = new ArrayList<>();
		if(list !=null ) {
			ipPlaningDTOs = list.stream().map(ip ->{
				return mapIpPlaningDto(ip);
			}).collect(Collectors.toList());
		}else {
			throw new EntityNotFoundException("List is empty.");
		}
		
	
		return ipPlaningDTOs;
	}

	private IpPlaningDTO mapIpPlaningDto(IpPlaning ip) {
		return Util.getMapper().map(ip, IpPlaningDTO.class);
	}

	private IpPlaning getIpPlaningById(long id) {
		IpPlaning ipPlaning = ipPlaningRepos.findById(id)
		              .orElseThrow(()-> new EntityNotFoundException("Entity not found against "+id));
		return ipPlaning;
	}



}
