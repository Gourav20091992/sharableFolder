package com.sakshath.core.controller;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.Exception.PhoneMasterException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.PhoneMaster;
import com.sakshath.core.response.PhoneMasterDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.PhoneMasterService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "PhoneMasterController", description = "Rest api for PhoneMasterController.")
@RestController
@RequestMapping(RestApiUrl.PHONE_MASTER_TYPE_API)
public class PhoneMasterController {
	
	@Autowired
	PhoneMasterService phoneMasterService;
	
	@Autowired
	ModelMapper modelMapper;

	Logger LOG = LoggerFactory.getLogger(AddressController.class);

	@GetMapping(RestApiUrl.GET_PHONE_MASTER_URL)
	public ResponseEntity<Response<?>> retrieveAddressByCustomerNumber(@PathVariable String customerNumber)
			throws FormValidationException, InvalidAuthenticationException, PhoneMasterException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_PHONE_MASTER_URL + " : retrievePhoneMasterByCustomerNumber()";

		LOG.info(method);
		Response<PhoneMasterDto> response = new Response<>();

		PhoneMaster phoneMasterResponse = phoneMasterService.fetchCustomerInfoByCustomerNumber(customerNumber);
		
		PhoneMasterDto phoneMasterDto = modelMapper.map(phoneMasterResponse, PhoneMasterDto.class);

		response.setList(Arrays.asList(phoneMasterDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);
	}

}
