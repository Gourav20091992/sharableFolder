package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.AgreementException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.Agreement;
import com.sakshath.core.repository.AgreementRepository;
import com.sakshath.core.response.AgreementDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.AgreementService;

@Service
public class AgreementServiceImpl implements AgreementService {
	
	Logger logger = LoggerFactory.getLogger(AgreementServiceImpl.class);
	
	@Autowired
	AgreementRepository agreementRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public AgreementDto fetchCustomerInfoByLoanAccountNumber(String loanAccountNumber) throws AgreementException {
		final String method = "AgreementServiceImpl : fetchDetailsByLoanAccountNumber(String loanAccountNumber)";

		logger.info(method);

		final Optional<Agreement> Optional = agreementRepository.findByLoanAccountNumber(loanAccountNumber);

		final Response<Agreement> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new AgreementException(response);
		} else {
			Agreement agreementObject = Optional.get();
			
			AgreementDto convertResponseToDto = convertResponseToDto(agreementObject);
						return convertResponseToDto;
		}
	}

	@Override
	public AgreementDto fetchAgreementInfoByCustomerNumber(String customerNumber) throws AgreementException {
		final String method = "AgreementServiceImpl : fetchDetailsByCustomerNumber(String customerNumber)";

		logger.info(method);

		final Optional<Agreement> Optional = agreementRepository.findByCustomerNumber(customerNumber);

		final Response<Agreement> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.fetchDetailsByCustomerNumber is returning Null when fetchCustomerInfoByCusotmerId call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.AGREEMENT_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new AgreementException(response);
		} else {
			Agreement agreementInfo = Optional.get();
			AgreementDto convertResponseToDto = convertResponseToDto(agreementInfo);
			
						return convertResponseToDto;
		}
	}
	
	private AgreementDto convertResponseToDto(Agreement agreement) {
		AgreementDto agreementDto = modelMapper.map(agreement, AgreementDto.class);
		
		return agreementDto;
		
	}

}
