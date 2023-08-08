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

import com.sakshath.core.Exception.EmailMasterException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.EmailMaster;
import com.sakshath.core.response.EmailMasterDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.EmailMasterService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "EmailMasterController", description = "Rest api for EmailMasterController.")
@RestController
@RequestMapping(RestApiUrl.EMAIL_MASTER_TYPE_API)
public class EmailMasterController {
	
	@Autowired
	EmailMasterService emailMasterService;
	
	@Autowired
	ModelMapper modelMapper;

	Logger LOG = LoggerFactory.getLogger(EmailMasterController.class);

	@GetMapping(RestApiUrl.GET_EMAIL_MASTER_URL)
	public ResponseEntity<Response<?>> retrieveAddressByCustomerNumber(@PathVariable String customerNumber)
			throws FormValidationException, InvalidAuthenticationException, EmailMasterException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_EMAIL_MASTER_URL + " : retrievedetailsByCustomerNumber()";

		LOG.info(method);
		Response<EmailMasterDto> response = new Response<>();

		EmailMaster emailMasterResponse = emailMasterService.fetchDetailsByCustomerNumber(customerNumber);
		
		EmailMasterDto emailMasterDto = modelMapper.map(emailMasterResponse, EmailMasterDto.class);

		response.setList(Arrays.asList(emailMasterDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}

}
