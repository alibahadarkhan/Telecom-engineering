package com.care.telecomEng.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
public class Customer extends BaseEntity{
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String firstName;
     String lastName;
    
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private User user;
    
    @OneToMany(mappedBy = "custumer" ,cascade = CascadeType.ALL)
    private List<Site> sites;
}
