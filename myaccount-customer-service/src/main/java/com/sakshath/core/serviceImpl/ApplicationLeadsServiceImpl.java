package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.ApplicationLeadsException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.ApplicationLeads;
import com.sakshath.core.repository.ApplicationLeadsRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.ApplicationLeadsService;

@Service
public class ApplicationLeadsServiceImpl implements ApplicationLeadsService {
	
	Logger logger = LoggerFactory.getLogger(ApplicationLeadsServiceImpl.class);
	
	ApplicationLeadsRepository repository;

	@Override
	public ApplicationLeads fetchDetailsByCustomerNumber(String customerNumber) throws ApplicationLeadsException {
		final String method = "ApplicationLeadsServiceImpl : fetchDetailsByCustomerNumber(long customerNumber)";

		logger.info(method);

		final Optional<ApplicationLeads> Optional = repository.findByCustomerNumber(customerNumber);

		final Response<ApplicationLeads> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new ApplicationLeadsException(response);
		} else {
			ApplicationLeads customerInfo = Optional.get();
						return customerInfo;
		}
	}

	@Override
	public ApplicationLeads fetchDetailsByApplicationReferenceId(String applicationReferenceId) throws ApplicationLeadsException  {
		final String method = "ApplicationLeadsServiceImpl : fetchDetailsByApplicationNumber(String customerNumber)";

		logger.info(method);

		final Optional<ApplicationLeads> Optional = repository.findByApplicationReferenceId(applicationReferenceId);

		final Response<ApplicationLeads> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new ApplicationLeadsException(response);
		} else {
			ApplicationLeads customerInfo = Optional.get();
						return customerInfo;
		}
	}

}
