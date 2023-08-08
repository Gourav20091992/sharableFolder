package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.FinDetails;

@Repository
public interface FinDetailsRepository extends JpaRepository<FinDetails,Integer>{

	Optional<FinDetails> findByLoanAccountNumber(String loanAccountNumber);
	
}
