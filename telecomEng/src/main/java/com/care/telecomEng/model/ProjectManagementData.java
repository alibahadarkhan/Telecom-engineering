package com.care.telecomEng.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ProjectManagementData extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String siteName;
	String location;
	String postCode;
	String cpe;
	String isp;
	String primaryCircuit;
	String secondaryCircuit;
	String cctRf;
	String siteTemplate;
	String secondaryCircuitIsp;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "template_id")
	private Template template;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "site_id")
	private Site site;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ip_planing_id")
	private IpPlaning ip_planing;
	
	

}
