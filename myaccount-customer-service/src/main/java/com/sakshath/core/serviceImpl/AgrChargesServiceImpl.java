package com.sakshath.core.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.AgrChargesException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.AgrCharges;
import com.sakshath.core.repository.AgrChargesRepository;
import com.sakshath.core.response.AgrChargesDto;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.AgrChargesService;

@Service
public class AgrChargesServiceImpl implements AgrChargesService{
	
Logger logger = LoggerFactory.getLogger(AgrChargesServiceImpl.class);
	
	@Autowired
	AgrChargesRepository agrChargesRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public AgrChargesDto fetchAgrChargesByLoanAccountNumber(String loanAccountNumber) throws AgrChargesException {
		final String method = "AgrChargesServiceImpl : fetchAgrChargesByCustomerNumber(string loanAccountNumber)";

		logger.info(method);

		final Optional<AgrCharges> Optional = agrChargesRepository.findByLoanAccountNumber(loanAccountNumber);

		final Response<AgrCharges> response = new Response<>();

		if (Objects.isNull(Optional) || !Optional.isPresent()) {
			logger.error("repository.findByLoanAccountNumber is returning Null when fetchAgrChargesByCustomerNumber call");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.AGR_CHARGES_RECORD_FETCH_BY_ID_FAILED_MESSAGE);
			throw new AgrChargesException(response);
		} else {
			AgrCharges agrChargesObject = Optional.get();
			
			AgrChargesDto convertResponseToDto = convertResponseToDto(agrChargesObject);
						return convertResponseToDto;
		}
	}
	
	private AgrChargesDto convertResponseToDto(AgrCharges agrCharges) {
		AgrChargesDto agreementDto = modelMapper.map(agrCharges, AgrChargesDto.class);
		
		return agreementDto;
		
	}

}
