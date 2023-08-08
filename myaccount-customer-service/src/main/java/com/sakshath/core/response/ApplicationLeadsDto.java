package com.sakshath.core.response;

import java.util.Date;

import lombok.Data;

@Data
public class ApplicationLeadsDto {

	    private Long id;
	    private String leadSourceName;
	    private String applicationReferenceId;
	    private Date applicationDate;
	    private String customerNumber;
	    private String leadStatus;
	    private String partnerName;
	    private String dsaName;
	    private String rmName;
	    private Date last_update_date;
	    private String lastUpdateStatus;
	
}
