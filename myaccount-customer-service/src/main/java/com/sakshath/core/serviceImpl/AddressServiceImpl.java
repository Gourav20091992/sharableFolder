package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.AddressException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.Address;
import com.sakshath.core.repository.AddressRepository;
import com.sakshath.core.response.AddressDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	ModelMapper modelMapper;

	
	@Override
	public AddressDto fetchAddressByCusotmerNumber(String customerNumber) throws AddressException {
		final String method = "AddressServiceImpl : fetchAddressByCusotmerNumber(String customerNumber)";

		logger.info(method);

		final Optional<Address> Optional = addressRepository.findByCustomerNumber(customerNumber);

		final Response<Address> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchAddressByCusotmerNumber is returning Null when findByCustomerNumber call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.ADDRESS_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new AddressException(response);
		} else {
			Address addressObject = Optional.get();
			
			AddressDto addressDto = modelMapper.map(addressObject, AddressDto.class);
						return addressDto;
		}
	}

}
