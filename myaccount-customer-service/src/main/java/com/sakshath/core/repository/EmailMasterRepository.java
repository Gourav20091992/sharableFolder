package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.EmailMaster;

@Repository
public interface EmailMasterRepository extends JpaRepository<EmailMaster, Integer> {

	Optional<EmailMaster> findByCustomerNumber(String customerNumber);

	Optional<EmailMaster> findByEmailId(String emailId);


}
