package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.CustomerRelationship;

@Repository
public interface CustomerRelationshipRepository extends JpaRepository<CustomerRelationship,Integer> {

	Optional<CustomerRelationship> findByLoanAccountNumber(String loanAccountNumber);

	Optional<CustomerRelationship> findByCustomerNumber(String customerNumber);

}
