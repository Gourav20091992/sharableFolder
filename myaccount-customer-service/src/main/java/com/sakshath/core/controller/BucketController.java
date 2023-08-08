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

import com.sakshath.core.Exception.BucketException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.Bucket;
import com.sakshath.core.response.BucketDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.BucketService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "BucketController", description = "Rest api for BucketController.")
@RestController
@RequestMapping(RestApiUrl.BUCKET_TYPE_API)
public class BucketController {
	
	@Autowired
	BucketService bucketService;
	
	@Autowired
	ModelMapper modelMapper;

	Logger LOG = LoggerFactory.getLogger(BucketController.class);

	@GetMapping(RestApiUrl.GET_BUCKET_URL)
	public ResponseEntity<Response<?>> retrieveBucketByLoanAccountNumber(@PathVariable String loanAccountNumber)
			throws FormValidationException, InvalidAuthenticationException, BucketException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_BUCKET_URL + " : retrieveAddressByCustomerNumber()";

		LOG.info(method);
		Response<BucketDto> response = new Response<>();

		Bucket bucketResponse = bucketService.fetchDetailsByLoanAccountNumber(loanAccountNumber);
		
		BucketDto bucketDto = modelMapper.map(bucketResponse, BucketDto.class);

		response.setList(Arrays.asList(bucketDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}

}
