package com.care.telecomEng.model;

import java.sql.Blob;

import javax.persistence.Entity;

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
public class Template extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String templateName;
	Blob script;

}
