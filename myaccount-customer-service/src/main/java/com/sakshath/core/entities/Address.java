package com.sakshath.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="address")
@Data
public class Address extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Column(columnDefinition = "VARCHAR(20)",name="customer_name")
	private String customerNumber;

	@Column(columnDefinition = "VARCHAR(20)",name="type_of_address")
	private String typeOfAddress;

	@Column(columnDefinition = "VARCHAR(60)",name="address_line_1")
	private String address_line_1;

	@Column(columnDefinition = "VARCHAR(60)",name="address_line_2")
	private String address_line_2;

	@Column(columnDefinition = "VARCHAR(50)",name="address_line_3")
	private String address_line_3;

	@Column(columnDefinition = "VARCHAR(50)",name="address_line_4")
	private String address_line_4;

	
	@Column(columnDefinition = "VARCHAR(30)",name="city")
	private String city;
	
	@Column(columnDefinition = "VARCHAR(30)",name="state")
	private String state;
	
	@Column(columnDefinition = "VARCHAR(15)",name="zip_code")
	private String zipCode;

}

