package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.CustomerInfoException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.CustomerInfo;
import com.sakshath.core.repository.CustomerInfoRepository;
import com.sakshath.core.response.CustomerInfoDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.CustomerInfoService;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

	Logger logger = LoggerFactory.getLogger(CustomerInfoServiceImpl.class);

	@Autowired
	CustomerInfoRepository customerInfoRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public CustomerInfoDto fetchCustomerInfoByCustomerNumber(String customerNumber) throws CustomerInfoException {
		final String method = "CustomerInfoServiceImpl : fetchCustomerInfoByCustomerNumber(String customerNumber)";

		logger.info(method);

		final Optional<CustomerInfo> customerInfoOptional = customerInfoRepository.findByCustomerNumber(customerNumber);

		final Response<CustomerInfo> response = new Response<>();

		if (Objects.isNull(customerInfoOptional) || !customerInfoOptional.isPresent()) {
			logger.error(
					"customerInfoRepository.findByCustomerNumber is returning Null when fetchCustomerInfoByCustomerNumber call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new CustomerInfoException(response);
		} else {
			CustomerInfo customerInfo = customerInfoOptional.get();
			CustomerInfoDto convertResponseToDto = convertResponseToDto(customerInfo);
			return convertResponseToDto;
		}
	}
	
	
	
	
	private CustomerInfoDto convertResponseToDto(CustomerInfo customerInfo) {
		CustomerInfoDto customerInfoDto = modelMapper.map(customerInfo, CustomerInfoDto.class);
		
		return customerInfoDto;
		
	}

}
