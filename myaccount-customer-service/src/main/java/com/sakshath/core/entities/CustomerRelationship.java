package com.sakshath.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="customer_relationship")
@Data
public class CustomerRelationship extends Auditable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition= "VARCHAR(20)",name="loan_account_number")
	private String loanAccountNumber;
	
	@Column(columnDefinition= "VARCHAR(20)",name="customer_number")
	private String customerNumber;
	
	@Column(columnDefinition= "VARCHAR(60)",name="role_association")
	private String roleAssociation;


}
