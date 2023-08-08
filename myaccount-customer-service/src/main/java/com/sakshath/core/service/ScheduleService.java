package com.sakshath.core.service;

import com.sakshath.core.Exception.ScheduleException;
import com.sakshath.core.entities.Schedule;

public interface ScheduleService {
	
	Schedule fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws ScheduleException;

}
