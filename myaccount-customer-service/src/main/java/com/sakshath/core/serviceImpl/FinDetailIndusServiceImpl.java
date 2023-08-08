package com.sakshath.core.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshath.core.Exception.FinDetailsException;
import com.sakshath.core.constant.HttpCode;
import com.sakshath.core.constant.ResponseMessage;
import com.sakshath.core.entities.FinDetailIndus;
import com.sakshath.core.repository.FinDetailIndusRepository;
import com.sakshath.core.response.Response;
import com.sakshath.core.service.FinDetailIndusService;

@Service
public class FinDetailIndusServiceImpl implements FinDetailIndusService {
	
	Logger logger = LoggerFactory.getLogger(EmailMasterServiceImpl.class);
	
	@Autowired
	FinDetailIndusRepository finDetailIndusRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	

	@Override
	public List<FinDetailIndus> findAllDetailsforIndusOfFinDetailsOfCustomer() throws FinDetailsException {
		// TODO Auto-generated method stub
		
		final String method = "FinDetailIndusServiceImpl : findAllDetailsforIndusOfFinDetailsOfCustomer()";

		logger.info(method);
		
		Response response = new Response<>();
		
		List<FinDetailIndus> listOfFinDetailIndus = finDetailIndusRepository.findAll();
		
		if(Objects.isNull(listOfFinDetailIndus) || listOfFinDetailIndus.isEmpty()) {
			logger.error("finDetailIndusRepository.findAll is returning null when findAllDetailsforIndusOfFinDetailsOfCustomer call ");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.FINDETAIL_FETCH_ALL_FAILED_MESSAGE);
			throw new FinDetailsException(response);
		}
		
		//List<FinDetailIndusDto> listOfFinDetailIndusDto = listOfFinDetailIndus.stream().map(finDetails -> modelMapper.map(finDetails,FinDetailIndusDto.class)).collect(Collectors.toList());
		
		return listOfFinDetailIndus;

}
	
}
