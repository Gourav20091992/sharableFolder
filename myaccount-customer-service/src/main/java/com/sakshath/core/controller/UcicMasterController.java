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
import com.sakshath.core.Exception.UcicMasterException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.UcicMaster;
import com.sakshath.core.response.Response;
import com.sakshath.core.response.UcicMasterDto;
import com.sakshath.core.service.UcicMasterService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "UcicMasterController", description = "Rest api for UcicMasterController.")
@RestController
@RequestMapping(RestApiUrl.UCIC_MASTER_TYPE_API)
public class UcicMasterController {
	
	@Autowired
	UcicMasterService ucicMasterService;
	
	@Autowired
	ModelMapper modelMapper;

	Logger LOG = LoggerFactory.getLogger(AddressController.class);

	@GetMapping(RestApiUrl.GET_UCIC_MASTER_URL)
	public ResponseEntity<Response<?>> retrieveAddressByCustomerNumber(@PathVariable String customerNumber)
			throws FormValidationException, InvalidAuthenticationException, UcicMasterException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_UCIC_MASTER_URL + " : retrieveAddressByCustomerNumber()";

		LOG.info(method);
		Response<UcicMasterDto> response = new Response<>();

		UcicMaster ucicMasterResponse = ucicMasterService.fetchDetailsByCustomerNumber(customerNumber);
		
	    UcicMasterDto ucicMasterDto = modelMapper.map(ucicMasterResponse, UcicMasterDto.class);

		response.setList(Arrays.asList(ucicMasterDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}

}
