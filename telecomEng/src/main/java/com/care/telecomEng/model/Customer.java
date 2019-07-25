package com.care.telecomEng.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends BaseEntity{
	
    private String firstName;
    private String lastName;
    
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private User user;
}
