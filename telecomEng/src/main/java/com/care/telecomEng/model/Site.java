package com.care.telecomEng.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Site extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String siteName;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	Customer custumer;

}
