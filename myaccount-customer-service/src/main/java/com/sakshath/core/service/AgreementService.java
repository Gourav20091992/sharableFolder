package com.sakshath.core.service;

import com.sakshath.core.Exception.AgreementException;
import com.sakshath.core.response.AgreementDto;

public interface AgreementService {
	
	AgreementDto fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws AgreementException;

	AgreementDto fetchAgreementInfoByCustomerNumber(String customerNumber) throws AgreementException;
}
