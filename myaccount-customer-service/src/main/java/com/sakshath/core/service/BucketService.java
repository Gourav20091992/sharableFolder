package com.sakshath.core.service;

import com.sakshath.core.Exception.BucketException;
import com.sakshath.core.entities.Bucket;

public interface BucketService {
	
	Bucket fetchDetailsByLoanAccountNumber(String loanAccountNumber) throws BucketException;

	Bucket fetchDetailsByBucketCode(String bucketCode) throws BucketException;
	
	
}
