package com.sakshath.core.response;

import lombok.Data;

@Data
public class UcicMasterDto {

	private Long id;
	private String sourceSystemName;
	private String applicationNumber;
	private String loanAccountNumber;
	private String customerNumber;
	private String accountStatus;
	private String ucic;
	private String gucic;

}
