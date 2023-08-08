package com.sakshath.core.service;

import com.sakshath.core.Exception.ApplicationLeadsException;
import com.sakshath.core.entities.ApplicationLeads;

public interface ApplicationLeadsService {
	
	ApplicationLeads fetchDetailsByCustomerNumber(String customerNumber) throws ApplicationLeadsException;
	
	ApplicationLeads fetchDetailsByApplicationReferenceId(String applicationReferenceId) throws ApplicationLeadsException ;

}
