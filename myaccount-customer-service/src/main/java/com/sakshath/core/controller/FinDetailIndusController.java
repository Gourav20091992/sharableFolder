package com.sakshath.core.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakshath.core.Exception.FinDetailsException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.FinDetailIndus;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.FinDetailIndusService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "FinDetailIndusController", description = "Rest api for FinDetailIndusController.")
@RestController
@RequestMapping("/api/customer")
public class FinDetailIndusController {

	@Autowired
	FinDetailIndusService finDetailIndusService;
	
	@Autowired
	ModelMapper modelMapper;

	Logger LOG = LoggerFactory.getLogger(AddressController.class);

	@GetMapping("/getAllFinDetailsOfIndus")
	public ResponseEntity<Response<?>> findAllDetailsforIndusOfFinDetailsOfCustomer()
			throws FormValidationException, InvalidAuthenticationException, FinDetailsException {

		//final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_FIN_DETAILS_URL + " : retrieveAddressByCustomerNumber()";

		LOG.info("findAllDetailsforIndusOfFinDetailsOfCustomer()");
		Response<FinDetailIndus> response = new Response<>();

		 List<FinDetailIndus> allDetailsforIndusOfFinDetailsOfCustomer = finDetailIndusService.findAllDetailsforIndusOfFinDetailsOfCustomer();
		

		response.setList(allDetailsforIndusOfFinDetailsOfCustomer);
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}
}
