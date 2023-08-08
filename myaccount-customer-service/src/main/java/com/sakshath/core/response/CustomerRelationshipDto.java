package com.sakshath.core.response;

import lombok.Data;

@Data
public class CustomerRelationshipDto {

	private Long id;
	private String loanAccountNumber;
	private String customerNumber;
	private String roleAssociation;

}
