package com.sakshath.core.service;

import com.sakshath.core.Exception.AddressException;
import com.sakshath.core.response.AddressDto;

public interface AddressService {
	
	AddressDto	 fetchAddressByCusotmerNumber(String customerId) throws AddressException;

}
