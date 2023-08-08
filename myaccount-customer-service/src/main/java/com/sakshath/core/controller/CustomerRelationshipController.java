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

import com.sakshath.core.Exception.CustomerRelationshipException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.CustomerRelationship;
import com.sakshath.core.response.CustomerRelationshipDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.CustomerRelationshipService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "CustomerRelationshipController", description = "Rest api for CustomerRelationshipController.")
@RestController
@RequestMapping(RestApiUrl.CUSTOMER_RELATIONSHIP_TYPE_API)
public class CustomerRelationshipController {
	@Autowired
	CustomerRelationshipService customerRelationshipService;
	
	@Autowired
	ModelMapper modelMapper;

	Logger LOG = LoggerFactory.getLogger(CustomerRelationshipController.class);

	@GetMapping(RestApiUrl.GET_CUSTOMER_RELATIONSHIP_URL)
	public ResponseEntity<Response<?>> retrieveAddressByLoanAccountNumber(@PathVariable String loanAccountNumber)
			throws FormValidationException, InvalidAuthenticationException, CustomerRelationshipException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_CUSTOMER_RELATIONSHIP_URL + " : retrieveAddressByLoanAccountNumber()";

		LOG.info(method);
		Response<CustomerRelationshipDto> response = new Response<>();

	    CustomerRelationship customerRelationResponse = customerRelationshipService.fetchCustomerInfoByLoanAccountNumber(loanAccountNumber);
		
		CustomerRelationshipDto customerRelationshipDto = modelMapper.map(customerRelationResponse, CustomerRelationshipDto.class);

		response.setList(Arrays.asList(customerRelationshipDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}

}
