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
public class IpPlaningDTO {
	
	Long id;
	String siteIp;
	String pupose;
	String description;
	String instance;
	String a_end31;
	String b_end31;
	String core_pe_name;
	String e_end_wan_port;
	String pe_interface;
	String outer_v_lan;
	String inner_v_lan;

}
