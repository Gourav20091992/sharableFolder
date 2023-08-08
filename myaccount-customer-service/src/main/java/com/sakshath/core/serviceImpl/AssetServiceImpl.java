package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.AssetException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.Asset;
import com.sakshath.core.repository.AssetRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.AssetService;

@Service
public class AssetServiceImpl implements AssetService {
	
	Logger logger = LoggerFactory.getLogger(AssetServiceImpl.class);
	
	@Autowired
	AssetRepository repository;

	@Override
	public Asset fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws AssetException {
		final String method = "AssetServiceImpl : fetchDetailsByLoanAccountNumber(String loanAccountNumber)";

		logger.info(method);

		final Optional<Asset> Optional = repository.findByLoanAccountNumber(loanAccountNumber);

		final Response<Asset> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new AssetException(response);
		} else {
			Asset customerInfo = Optional.get();
						return customerInfo;
		}
	}

	@Override
	public Asset fetchCustomerInfoBySerialNo(String serialNo) throws AssetException {
		final String method = "AssetServiceImpl : fetchDetailsBySerialNo(String serialNo)";

		logger.info(method);

		final Optional<Asset> Optional = repository.findByAssetSerialNo(serialNo);

		final Response<Asset> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new AssetException(response);
		} else {
			Asset customerInfo = Optional.get();
						return customerInfo;
		}
	}

	
}
