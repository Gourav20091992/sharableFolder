package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.FinDetailsException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.FinDetails;
import com.sakshath.core.repository.FinDetailsRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.FinDetailsService;

@Service
public class FinDetailsServiceImpl implements FinDetailsService {
	
	@Autowired
	FinDetailsRepository repository;
	
	Logger logger = LoggerFactory.getLogger(FinDetailsServiceImpl.class);

	@Override
	public FinDetails fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws FinDetailsException {
		final String method = "FinDetailsServiceImpl : fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber)";

		logger.info(method);

		final Optional<FinDetails> Optional = repository.findByLoanAccountNumber(loanAccountNumber);

		final Response<FinDetails> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new FinDetailsException(response);
		} else {
			FinDetails customerInfo = Optional.get();
						return customerInfo;
		}
	}

}
