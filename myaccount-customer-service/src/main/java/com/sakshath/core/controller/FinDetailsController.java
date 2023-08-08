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

import com.sakshath.core.Exception.FinDetailsException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.FinDetails;
import com.sakshath.core.response.FinDetailsDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.FinDetailsService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "FinDetailsController", description = "Rest api for FinDetailsController.")
@RestController
@RequestMapping(RestApiUrl.FIN_DETAILS_TYPE_API)
public class FinDetailsController {

	@Autowired
	FinDetailsService finDetailsService;
	
	@Autowired
	ModelMapper modelMapper;

	Logger LOG = LoggerFactory.getLogger(AddressController.class);

	@GetMapping(RestApiUrl.GET_FIN_DETAILS_URL)
	public ResponseEntity<Response<?>> retrieveAddressByLoanAccountNumber(@PathVariable String loanAccountNumber)
			throws FormValidationException, InvalidAuthenticationException, FinDetailsException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_FIN_DETAILS_URL + " : retrieveAddressByCustomerNumber()";

		LOG.info(method);
		Response<FinDetailsDto> response = new Response<>();

		FinDetails finDetailsResponse = finDetailsService.fetchCustomerInfoByLoanAccountNumber(loanAccountNumber);
		
		FinDetailsDto finDetailsDto = modelMapper.map(finDetailsResponse, FinDetailsDto.class);

		response.setList(Arrays.asList(finDetailsDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}

	
}
