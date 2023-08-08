package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.EmailMasterException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.EmailMaster;
import com.sakshath.core.repository.EmailMasterRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.EmailMasterService;

@Service
public class EmailMasterServiceImpl implements EmailMasterService {
	
	Logger logger = LoggerFactory.getLogger(EmailMasterServiceImpl.class);
	
	@Autowired
	EmailMasterRepository repository;

	@Override
	public EmailMaster fetchDetailsByCustomerNumber(String customerNumber) throws EmailMasterException {
		final String method = "EmailMasterServiceImpl : fetchDetailsByCustomerNumber(long customerNumber)";

		logger.info(method);

		final Optional<EmailMaster> Optional = repository.findByCustomerNumber(customerNumber);

		final Response<EmailMaster> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new EmailMasterException(response);
		} else {
			EmailMaster customerInfo = Optional.get();
						return customerInfo;
		}
	}

	@Override
	public EmailMaster fetchDetailsByEmailId(String emailId) throws EmailMasterException {
		final String method = "UcicMasterServiceImpl : fetchDetailsByEmailId(String EmailId)";

		logger.info(method);

		final Optional<EmailMaster> Optional = repository.findByEmailId(emailId);

		final Response<EmailMaster> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchCustomerInfoByEmailId is returning Null when fetchCustomerApplicationNumber call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new EmailMasterException(response);
		} else {
			EmailMaster customerInfo = Optional.get();
						return customerInfo;
		}
	}

}
