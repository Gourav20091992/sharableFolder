package com.sakshath.core.response;

import lombok.Data;

@Data
public class PhoneMasterDto {

	private Long id;
    private String customerNumber;
    private String phoneType;
    private String phoneNumber;
    private String priority;
	
}
