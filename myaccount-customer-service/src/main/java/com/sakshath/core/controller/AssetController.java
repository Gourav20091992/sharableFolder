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

import com.sakshath.core.Exception.AssetException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.constant.RestApiUrl;
import com.sakshath.core.entities.Asset;
import com.sakshath.core.response.AssetDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.AssetService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api(value = "AssetController", description = "Rest api for AssetController")
@RequestMapping(RestApiUrl.ASSET_API)
public class AssetController {
	
	@Autowired
	AssetService assetService;
	
	@Autowired
	ModelMapper modelMapper;
	
	Logger LOG = LoggerFactory.getLogger(AssetController.class);

	@GetMapping(RestApiUrl.GET_ASSET_URL)
	public ResponseEntity<Response<?>> retrieveAddressByLoanAccountNumber(@PathVariable String loanAccountNumber)
			throws FormValidationException, InvalidAuthenticationException, AssetException {

		final String method = RestApiUrl.CUSTOMER_BASE_URL + RestApiUrl.GET_ASSET_URL + " : retrieveAddressByCustomerNumber()";

		LOG.info(method);
		Response<AssetDto> response = new Response<>();

		Asset assetResponse = assetService.fetchCustomerInfoByLoanAccountNumber(loanAccountNumber);
		
		AssetDto assetDto = modelMapper.map(assetResponse, AssetDto.class);

		response.setList(Arrays.asList(assetDto));
		response.setCode(HttpCode.OK);
		response.setMessage("Records retrieved Successfully !");
	
		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);

	}
	
}
