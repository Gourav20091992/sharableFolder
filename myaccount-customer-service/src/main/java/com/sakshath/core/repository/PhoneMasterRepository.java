package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.PhoneMaster;

@Repository
public interface PhoneMasterRepository extends JpaRepository<PhoneMaster,Integer>{

	Optional<PhoneMaster> findByCustomerNumber(String customerNumber);
	
}
