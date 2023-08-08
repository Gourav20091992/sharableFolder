package com.sakshath.core.controller;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakshath.core.Exception.AddressException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.response.AddressDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.AddressService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "AddressController", description = "Rest api for AddressController.")
@RestController
@RequestMapping(RestApiUrl.ADDRESS_TYPE_API)
public class AddressController {

	@Autowired
	AddressService addressService;
	
	
	Logger LOG = LoggerFactory.getLogger(AddressController.class);

	@GetMapping(RestApiUrl.GET_ADDRESS_URL)
	public ResponseEntity<Response<?>> retrieveAddressByCustomerNumber(@PathVariable String customerNumber)
			throws FormValidationException, InvalidAuthenticationException, AddressException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_ADDRESS_URL + " : retrieveAddressByCustomerNumber()";

		LOG.info(method);
		Response<AddressDto> response = new Response<>();

		 AddressDto addressDto = addressService.fetchAddressByCusotmerNumber(customerNumber);
		
		response.setList(Arrays.asList(addressDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}

}
