package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.UcicMasterException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.UcicMaster;
import com.sakshath.core.repository.UcicMasterRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.UcicMasterService;

@Service
public class UcicMasterServiceImpl implements UcicMasterService {
	
	Logger logger = LoggerFactory.getLogger(UcicMasterServiceImpl.class);
	
	@Autowired
	UcicMasterRepository repository;

	@Override
	public UcicMaster fetchDetailsByCustomerNumber(String customerNumber) throws UcicMasterException {
		final String method = "UcicMasterServiceImpl : fetchDetailsByCustomerNumber(long customerNumber)";

		logger.info(method);

		final Optional<UcicMaster> Optional = repository.findByCustomerNumber(customerNumber);

		final Response<UcicMaster> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new UcicMasterException(response);
		} else {
			UcicMaster customerInfo = Optional.get();
						return customerInfo;
		}
	}

	@Override
	public UcicMaster fetchDetailsByApplicationNumber(String applicationNumber) throws UcicMasterException {
		final String method = "UcicMasterServiceImpl : fetchDetailsByApplicationNumber(String ApplicationNumber)";

		logger.info(method);

		final Optional<UcicMaster> Optional = repository.findByApplicationNumber(applicationNumber);

		final Response<UcicMaster> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchCustomerInfoByCusotmerId is returning Null when fetchCustomerApplicationNumber call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new UcicMasterException(response);
		} else {
			UcicMaster customerInfo = Optional.get();
						return customerInfo;
		}
	}

}
