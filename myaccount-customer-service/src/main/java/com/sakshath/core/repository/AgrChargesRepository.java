package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.AgrCharges;

@Repository
public interface AgrChargesRepository extends JpaRepository<AgrCharges,Long>{

	Optional<AgrCharges> findByLoanAccountNumber(String loanAccountNumber); 
	
}
