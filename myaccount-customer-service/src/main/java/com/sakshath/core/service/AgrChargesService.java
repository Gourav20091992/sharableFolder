package com.sakshath.core.service;

import com.sakshath.core.Exception.AgrChargesException;
import com.sakshath.core.response.AgrChargesDto;

public interface AgrChargesService {
	
	AgrChargesDto fetchAgrChargesByLoanAccountNumber(String loanAccountNumber) throws AgrChargesException;

}
