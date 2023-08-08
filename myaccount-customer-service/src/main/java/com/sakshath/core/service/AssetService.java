package com.sakshath.core.service;

import com.sakshath.core.Exception.AssetException;
import com.sakshath.core.entities.Asset;

public interface AssetService {

	Asset fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws AssetException;
	
	Asset fetchCustomerInfoBySerialNo(String serialNo) throws AssetException;
}
