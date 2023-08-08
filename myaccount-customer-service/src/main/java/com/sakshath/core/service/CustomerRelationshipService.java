package com.sakshath.core.service;

import com.sakshath.core.Exception.CustomerRelationshipException;
import com.sakshath.core.entities.CustomerRelationship;

public interface CustomerRelationshipService {
	
	CustomerRelationship fetchCustomerInfoByCustomerNumber(String customerNumber) throws CustomerRelationshipException;
	
	CustomerRelationship  fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws CustomerRelationshipException;

}
