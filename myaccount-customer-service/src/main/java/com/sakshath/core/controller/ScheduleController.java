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
import com.sakshath.core.Exception.ScheduleException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.Schedule;
import com.sakshath.core.response.Response;
import com.sakshath.core.response.ScheduleDto;
import com.sakshath.core.service.ScheduleService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "ScheduleController", description = "Rest api for ScheduleController.")
@RestController
@RequestMapping(RestApiUrl.SCHEDULE_TYPE_API)
public class ScheduleController {

	@Autowired
	ScheduleService scheduleService;

	@Autowired
	ModelMapper modelMapper;

	Logger LOG = LoggerFactory.getLogger(AddressController.class);

	@GetMapping(RestApiUrl.GET_SCHEDULE_URL)
	public ResponseEntity<Response<?>> retrieveAddressByCustomerNumber(@PathVariable String loanAccountNumber)
			throws FormValidationException, InvalidAuthenticationException, ScheduleException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_SCHEDULE_URL + " : retrieveAddressByLoanAccountNumber()";

		LOG.info(method);
		Response<ScheduleDto> response = new Response<>();

		Schedule scheduleResponse = scheduleService.fetchCustomerInfoByLoanAccountNumber(loanAccountNumber);

		ScheduleDto scheduleDto = modelMapper.map(scheduleResponse, ScheduleDto.class);

		response.setList(Arrays.asList(scheduleDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");

		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}	
}
