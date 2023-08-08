package com.sakshath.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "phone_master")
@Data
public class PhoneMaster extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(columnDefinition = "VARCHAR(20)", name = "customer_number")
	private String customerNumber;

	@Column(columnDefinition = "VARCHAR(20)", name = "phone_type")
	private String phoneType;

	@Column(columnDefinition = "VARCHAR(60)", name = "phone_number")
	private String phoneNumber;

	@Column(columnDefinition = "VARCHAR(30)", name = "priority")
	private String priority;

}
