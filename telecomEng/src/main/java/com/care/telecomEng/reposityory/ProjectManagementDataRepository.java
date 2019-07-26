package com.care.telecomEng.reposityory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.care.telecomEng.model.ProjectManagementData;

@Repository
public interface ProjectManagementDataRepository extends CrudRepository<ProjectManagementData, Long> {

}
