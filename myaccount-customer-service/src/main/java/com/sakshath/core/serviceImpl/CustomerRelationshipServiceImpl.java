package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.CustomerRelationshipException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.CustomerRelationship;
import com.sakshath.core.repository.CustomerRelationshipRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.CustomerRelationshipService;

@Service
public class CustomerRelationshipServiceImpl implements CustomerRelationshipService{
	
	@Autowired 
	CustomerRelationshipRepository repository;
	
	Logger logger = LoggerFactory.getLogger(CustomerRelationshipServiceImpl.class);

	@Override
	public CustomerRelationship fetchCustomerInfoByCustomerNumber(String customerNumber) throws CustomerRelationshipException{
		final String method = "CustomerRelationshipServiceImpl : fetchDetailsByCustomerNumber(String customerNumber)";

		logger.info(method);

		final Optional<CustomerRelationship> Optional = repository.findByCustomerNumber(customerNumber);

		final Response<CustomerRelationship> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new CustomerRelationshipException(response);
		} else {
			CustomerRelationship customerInfo = Optional.get();
						return customerInfo;
		}
	}

	@Override
	public CustomerRelationship fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws CustomerRelationshipException{
		final String method = "CustomerRelationshipServiceImpl : fetchDetailsByCustomerNumber(String customerNumber)";

		logger.info(method);

		final Optional<CustomerRelationship> Optional = repository.findByCustomerNumber(loanAccountNumber);

		final Response<CustomerRelationship> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new CustomerRelationshipException(response);
		} else {
			CustomerRelationship customerInfo = Optional.get();
						return customerInfo;
		}
	}

}
