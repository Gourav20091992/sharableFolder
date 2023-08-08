package com.sakshath.core.service;

import com.sakshath.core.Exception.PhoneMasterException;
import com.sakshath.core.entities.PhoneMaster;

public interface PhoneMasterService {
	
	PhoneMaster fetchCustomerInfoByCustomerNumber(String customerNumber) throws PhoneMasterException;

}
