package com.sakshath.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ucic_master")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UcicMaster extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Column(columnDefinition = "VARCHAR(20)",name="source_System_name")
	private String sourceSystemName;
	
	@Column(columnDefinition = "VARCHAR(20)",name="application_number")
	private String applicationNumber;
	
	@Column(columnDefinition = "VARCHAR(20)",name="loan_account_number")
	private String loanAccountNumber;
	
	@Column(columnDefinition = "VARCHAR(20)",name="customer_number")
	private String customerNumber;
	
	@Column(columnDefinition = "VARCHAR(10)",name="account_status")
	private String accountStatus;
	
	@Column(columnDefinition = "VARCHAR(20)",name="ucic")
	private String ucic;
	
	@Column(columnDefinition = "VARCHAR(20)",name="gucic")
	private String gucic;
	

}

