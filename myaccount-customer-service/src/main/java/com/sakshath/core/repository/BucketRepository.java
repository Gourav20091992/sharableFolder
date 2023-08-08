package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.Bucket;

@Repository
public interface BucketRepository extends JpaRepository<Bucket,Integer>{
	
	Optional<Bucket> findByLoanAccountNumber(String loanAccountNumber);
	
	Optional<Bucket> findByBucketCode(String bucketCode);

}
