package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.ApplicationLeads;

@Repository
public interface ApplicationLeadsRepository extends JpaRepository<ApplicationLeads,Integer>{

	Optional<ApplicationLeads> findByCustomerNumber(String customerNumber);

	Optional<ApplicationLeads> findByApplicationReferenceId(String applicationReferenceId);

	
}
