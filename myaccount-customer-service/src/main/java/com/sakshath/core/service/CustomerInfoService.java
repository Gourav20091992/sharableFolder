package com.sakshath.core.service;

import com.sakshath.core.Exception.CustomerInfoException;
import com.sakshath.core.response.CustomerInfoDto;

public interface CustomerInfoService {

	CustomerInfoDto fetchCustomerInfoByCustomerNumber(String customerNumber) throws CustomerInfoException;

//	CustomerInfoLoanDetailsDto fetchCustomerInfoByCustomerNoOrLoanNoOrUciciNoOrPanNo(String panNumber);
	

}
