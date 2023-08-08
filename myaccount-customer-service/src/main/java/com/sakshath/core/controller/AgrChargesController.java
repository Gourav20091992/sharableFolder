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

import com.sakshath.core.Exception.AgrChargesException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.response.AgrChargesDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.AgrChargesService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "AgrChargesController", description = "Rest api for AgrChargesController.")
@RestController
@RequestMapping(RestApiUrl.AGRCHARGES_TYPE_API)
public class AgrChargesController {

	@Autowired
	AgrChargesService agrChargesService;
	
	

	Logger LOG = LoggerFactory.getLogger(AgrChargesController.class);

	@GetMapping(RestApiUrl.GET_AGRCHARGES)
	public ResponseEntity<Response<?>> retrieveAgrChargersByCustomerNumber(@PathVariable String loanAccountNumber)
			throws AgrChargesException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_AGRCHARGES
				+ " : retrieveAgrChargersByCustomerNumber()";

		LOG.info(method);
		Response<AgrChargesDto> response = new Response<>();

		AgrChargesDto agrChargesDto	 = agrChargesService.fetchAgrChargesByLoanAccountNumber(loanAccountNumber);

		
		
		response.setList(Arrays.asList(agrChargesDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}
	
	

}
