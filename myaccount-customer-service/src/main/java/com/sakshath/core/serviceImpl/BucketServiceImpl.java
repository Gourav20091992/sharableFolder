package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.BucketException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.Bucket;
import com.sakshath.core.repository.BucketRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.BucketService;

@Service
public class BucketServiceImpl implements BucketService {
	
	@Autowired
	BucketRepository repository;

	Logger logger = LoggerFactory.getLogger(BucketServiceImpl.class);
	
	@Override
	public Bucket fetchDetailsByLoanAccountNumber(String loanAccountNumber) throws BucketException {
		final String method = "BucketServiceImpl : fetchDetailsByLoanAccountNumber(String loanAccountNumber)";

		logger.info(method);

		final Optional<Bucket> Optional = repository.findByLoanAccountNumber(loanAccountNumber);

		final Response<Bucket> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new BucketException(response);
		} else {
			Bucket customerInfo = Optional.get();
						return customerInfo;
		}
	}

	@Override
	public Bucket fetchDetailsByBucketCode(String bucketCode) throws BucketException {
		final String method = "BucketServiceImpl : fetchDetailsByLoanAccountNumber(String bucketCode)";

		logger.info(method);

		final Optional<Bucket> Optional = repository.findByBucketCode(bucketCode);

		final Response<Bucket> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new BucketException(response);
		} else {
			Bucket customerInfo = Optional.get();
						return customerInfo;
		}
	}

}
