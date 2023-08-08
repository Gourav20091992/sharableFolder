package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.Agreement;

@Repository
public interface AgreementRepository extends JpaRepository<Agreement,Long>{

	Optional<Agreement> findByCustomerNumber(String customerNumber);

	Optional<Agreement> findByLoanAccountNumber(String loanAccountNumber);
}
