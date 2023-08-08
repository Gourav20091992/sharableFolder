package com.sakshath.core.response;

import lombok.Data;

@Data
public class AddressDto {

	private String customerNumber;
    private String typeOfAddress;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String city;
    private String state;
    private String zipCode;
	
	
	
}
