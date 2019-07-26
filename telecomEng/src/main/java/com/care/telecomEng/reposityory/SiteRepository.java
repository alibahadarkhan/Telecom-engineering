package com.care.telecomEng.reposityory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.care.telecomEng.model.Site;

@Repository
public interface SiteRepository extends CrudRepository<Site, Long> {

}
