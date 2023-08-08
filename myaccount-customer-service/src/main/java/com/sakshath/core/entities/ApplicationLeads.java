package com.sakshath.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="application_lead")
@Data
public class ApplicationLeads extends Auditable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "VARCHAR(20)",name="lead_source_name")
	private String leadSourceName;
	
	@Column(columnDefinition = "VARCHAR(20)",name="application_reference_id")
	private String applicationReferenceId;
	
	@Column(name="application_date")
	private Date applicationDate;
	
	@Column(columnDefinition = "VARCHAR(20)",name="customer_number")
	private String customerNumber;
	
	@Column(columnDefinition = "VARCHAR(20)",name="lead_status")
	private String leadStatus;
	
	@Column(columnDefinition = "VARCHAR(40)",name="partner_name")
	private String partnerName;
	
	@Column(columnDefinition = "VARCHAR(40)",name="dsa_name")
	private String dsaName;
	
	@Column(columnDefinition = "VARCHAR(40)",name="rm_name")
	private String rmName;
	
	private Date last_update_date;
	
	@Column(columnDefinition = "VARCHAR(40)",name="last_update_status")
	private String lastUpdateStatus;
	

	

}

