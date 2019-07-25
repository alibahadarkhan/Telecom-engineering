package com.care.telecomEng.dto;

import java.util.Collection;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.care.telecomEng.model.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	@NotBlank
    private String firstName;

	@NotBlank
    private String lastName;

	@NotBlank
    private String password;

	@NotBlank
    private String confirmPassword;

    @NotBlank
    private String email;

}
