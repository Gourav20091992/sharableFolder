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

import com.sakshath.core.Exception.CustomerInfoException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.repository.CustomerInfoRepository;
import com.sakshath.core.response.CustomerInfoDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.CustomerInfoService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "CustomerInfoController", description = "Rest api for CustomerInfoController.")
@RestController
@RequestMapping(RestApiUrl.CUSTOMER_TYPE_API)
public class CustomerInfoController {

	Logger LOG = LoggerFactory.getLogger(CustomerInfoController.class);

	@Autowired
	private CustomerInfoService customerInfoService;

	@Autowired
	CustomerInfoRepository customerInfoRepository;

	@Autowired
	ModelMapper modelMapper;

	@GetMapping(RestApiUrl.GET_URL)
	public ResponseEntity<Response<?>> retrieveCustomerInfoById(@PathVariable String customerNumber)
			throws FormValidationException, InvalidAuthenticationException, CustomerInfoException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_URL + " : retrieveCustomer()";

		LOG.info(method);

		Response<CustomerInfoDto> response = new Response<>();

	 CustomerInfoDto customerInfoDto = customerInfoService.fetchCustomerInfoByCustomerNumber(customerNumber);

		

		response.setList(Arrays.asList(customerInfoDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");

		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}
	
//	@GetMapping(RestApiUrl.GET_URL)
//	public ResponseEntity<Response<?>> retrieveCustomerInfoByPanNumberOrCustomerNumberOrLoanNumberOrUcici(@RequestParam(required = false)String customerNumber,
//			@RequestParam(required = false)String panNumber,
//			@RequestParam(required = false)String loanNumber,
//			@RequestParam(required = false)String ucicNumber			
//			)
//			throws FormValidationException, InvalidAuthenticationException, CustomerInfoException {
//
//		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_URL + " : retrieveCustomerInfoByPanNumber()";
//
//		LOG.info(method);
//
//		Response<CustomerInfoDto> response = new Response<>();
//
//	 customerInfoService.fetchCustomerInfoByCustomerNoOrLoanNoOrUciciNoOrPanNo(panNumber);
//
//	
//		response.setList(Arrays.asList(customerInfoDto));
//		response.setCode(HttpCode.OK);
//		response.setMessage("Records retrieved Successfully !");
//
//		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);
//
//	}

}
