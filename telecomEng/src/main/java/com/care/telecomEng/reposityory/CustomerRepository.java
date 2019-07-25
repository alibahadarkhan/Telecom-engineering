package com.care.telecomEng.reposityory;

import org.springframework.data.repository.CrudRepository;

import com.care.telecomEng.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
