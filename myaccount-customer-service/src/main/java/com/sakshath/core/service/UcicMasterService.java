package com.sakshath.core.service;

import com.sakshath.core.Exception.UcicMasterException;
import com.sakshath.core.entities.UcicMaster;

public interface UcicMasterService {
	
	UcicMaster fetchDetailsByCustomerNumber(String customerNumber) throws UcicMasterException;
	
	UcicMaster fetchDetailsByApplicationNumber(String applicationNumber) throws UcicMasterException;

}
