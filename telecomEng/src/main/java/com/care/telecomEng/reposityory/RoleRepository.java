package com.care.telecomEng.reposityory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.care.telecomEng.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	
	public Role findByRoleNameContainingIgnoreCase(String roleName);

}
