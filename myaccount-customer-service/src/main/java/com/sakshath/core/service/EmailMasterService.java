package com.sakshath.core.service;

import com.sakshath.core.Exception.EmailMasterException;
import com.sakshath.core.entities.EmailMaster;

public interface EmailMasterService {
	
	EmailMaster fetchDetailsByCustomerNumber(String customerNumber) throws EmailMasterException;
	
	EmailMaster fetchDetailsByEmailId(String emailId) throws EmailMasterException;

}
