package com.care.telecomEng.reposityory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.care.telecomEng.model.IpPlaning;

@Repository
public interface IpPlaningRepository extends CrudRepository<IpPlaning, Long> {

}
