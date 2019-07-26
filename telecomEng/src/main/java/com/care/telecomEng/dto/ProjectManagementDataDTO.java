package com.care.telecomEng.dto;

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
public class ProjectManagementDataDTO {

	Long id;
	String siteName;
	String location;
	String newAttribute;
	String postCode;
	String cpe;
	String isp;
	String primaryCircuit;
	String secondaryCircuit;
	String cctRf;
	String siteTemplate;
	String secondaryCircuit_isp;
	String secondaryCircuit_cct_rf;
}
