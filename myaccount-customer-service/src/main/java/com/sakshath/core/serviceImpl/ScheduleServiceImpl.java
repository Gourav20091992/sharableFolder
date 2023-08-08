package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.ScheduleException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.Schedule;
import com.sakshath.core.repository.ScheduleRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	ScheduleRepository repository;

	Logger logger = LoggerFactory.getLogger(ScheduleServiceImpl.class);

	@Override
	public Schedule fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws ScheduleException {
		final String method = "ScheduleServiceImpl : fetchDetailsByCustomerNumber(String customerNumber)";
		logger.info(method);

		final Optional<Schedule> Optional = repository.findByLoanAccountNumber(loanAccountNumber);

		final Response<Schedule> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new ScheduleException(response);
		} else {
			Schedule customerInfo = Optional.get();
						return customerInfo;
		}
	}

}
