package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.UcicMaster;

@Repository
public interface UcicMasterRepository extends JpaRepository<UcicMaster,Integer>{

	Optional<UcicMaster> findByCustomerNumber(String customerNumber);
	
	Optional<UcicMaster> findByApplicationNumber(String applicationNumber);
	
}
