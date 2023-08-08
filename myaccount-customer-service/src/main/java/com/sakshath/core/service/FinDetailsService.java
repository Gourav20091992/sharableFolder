package com.sakshath.core.service;

import com.sakshath.core.Exception.FinDetailsException;
import com.sakshath.core.entities.FinDetails;

public interface FinDetailsService {
	
	FinDetails fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws FinDetailsException;

}
