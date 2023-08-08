package com.sakshath.core.response;

import lombok.Data;

@Data
public class EmailMasterDto {

	private Long id;
	private String customerNumber;
	private String emailType;
	private String emailId;
	private String priority;

}
