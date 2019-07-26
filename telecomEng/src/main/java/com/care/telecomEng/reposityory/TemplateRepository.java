package com.care.telecomEng.reposityory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.care.telecomEng.model.Template;

@Repository
public interface TemplateRepository extends CrudRepository<Template, Long> {

}
