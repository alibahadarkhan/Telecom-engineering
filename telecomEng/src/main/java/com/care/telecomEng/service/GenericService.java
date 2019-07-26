package com.care.telecomEng.service;

public interface GenericService<T> {
	
	T save(T dto);
	T update(T dto);
	void delete(Long dto);
	T getById(long id);
 } 