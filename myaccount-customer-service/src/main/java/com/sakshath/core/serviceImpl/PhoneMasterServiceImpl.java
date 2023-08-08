package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.PhoneMasterException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.PhoneMaster;
import com.sakshath.core.repository.PhoneMasterRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.PhoneMasterService;

@Service
public class PhoneMasterServiceImpl implements PhoneMasterService {
	
	@Autowired
	PhoneMasterRepository repository;
	
	Logger logger = LoggerFactory.getLogger(PhoneMasterServiceImpl.class);

	@Override
	public PhoneMaster fetchCustomerInfoByCustomerNumber(String customerNumber) throws PhoneMasterException {
		final String method = "PhoneMasterServiceImpl : fetchDetailsByCustomerNumber(String customerNumber)";
		logger.info(method);

		final Optional<PhoneMaster> Optional = repository.findByCustomerNumber(customerNumber);

		final Response<PhoneMaster> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new PhoneMasterException(response);
		} else {
			PhoneMaster customerInfo = Optional.get();
						return customerInfo;
		}
	}
}
