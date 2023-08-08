package com.sakshath.core.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

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

import com.sakshath.core.Exception.ApplicationLeadsException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.ApplicationLeads;
import com.sakshath.core.response.ApplicationLeadsDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.ApplicationLeadsService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api(value = "ApplicationLeadsController", description = "Rest api for ApplicationLeadsController.")
@RequestMapping(RestApiUrl.APPLICATION_LEADS_API)
public class ApplicationLeadsController {
	
	@Autowired
	ApplicationLeadsService applicationLeadsService;
	
	@Autowired
	ModelMapper modelMapper;
	
	Logger LOG = LoggerFactory.getLogger(ApplicationLeadsController.class);
	
	@GetMapping(RestApiUrl.GET_URL)
	public ResponseEntity<Response<?>> retrieveApplicationLeadsByCusomerNumber(@PathVariable String customerNumber,
			HttpServletResponse httpServletResponse) throws FormValidationException, InvalidAuthenticationException,ApplicationLeadsException{

		
		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_URL + " : retrieveCustomer()";

		LOG.info(method);
		Response<ApplicationLeadsDto> response = new Response();

        ApplicationLeads applicationLeadsResponse = applicationLeadsService.fetchDetailsByCustomerNumber(customerNumber);
		ApplicationLeadsDto applicationLeadsDto = modelMapper.map(applicationLeadsResponse, ApplicationLeadsDto.class);
		
		response.setList(Arrays.asList(applicationLeadsDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
		System.out.println(response);
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}  
}
