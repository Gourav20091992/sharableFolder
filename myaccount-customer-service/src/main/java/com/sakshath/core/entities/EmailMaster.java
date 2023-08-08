package com.sakshath.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="email_master")
@Data
public class EmailMaster extends Auditable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Column(columnDefinition = "VARCHAR(20)",name = "customer_number")
	private String customerNumber;
	
	@Column(columnDefinition = "VARCHAR(20)",name="email_type")
	private String emailType;
	
	@Column(columnDefinition = "VARCHAR(60)",name="email_id")
	private String emailId;
	
	@Column(columnDefinition = "VARCHAR(30)",name="priority")
	private String priority;
	
}