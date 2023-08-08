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

import com.sakshath.core.Exception.AgreementException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.response.AgreementDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.AgreementService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "AgreementController", description = "Rest api for AgreementController")
@RestController
@RequestMapping(RestApiUrl.AGREEMENT_TYPE_API)
public class AgreementController {

	@Autowired
	AgreementService agreementService;
	
	
	Logger LOG = LoggerFactory.getLogger(AgreementController.class);

	@GetMapping(RestApiUrl.GET_AGREEMENT_URL)
	public ResponseEntity<Response<?>> retrieveAgreementByCustomerNumber(@PathVariable String customerNumber)
			throws FormValidationException, InvalidAuthenticationException, AgreementException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_AGREEMENT_URL + " : retrieveAddressByCustomerNumber()";

		LOG.info(method);
		Response<AgreementDto> response = new Response<>();

		AgreementDto agreementDto = agreementService.fetchAgreementInfoByCustomerNumber(customerNumber);
		
	
		response.setList(Arrays.asList(agreementDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}

}
