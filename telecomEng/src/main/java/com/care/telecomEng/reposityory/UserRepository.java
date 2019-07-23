package com.care.telecomEng.reposityory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.care.telecomEng.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
}
