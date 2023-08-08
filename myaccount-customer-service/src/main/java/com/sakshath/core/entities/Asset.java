package com.sakshath.core.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="asset")
public class Asset extends Auditable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition="VARCHAR(20)",name="loan_account_number")
	private String loanAccountNumber;
	
	@Column(columnDefinition="VARCHAR(20)",name="type_of_asset")
	private String typeOfAsset;
	
	@Column(precision = 5,name="asset_serial_no")
	private BigDecimal assetSerialNo;
	
	@Column(columnDefinition="VARCHAR(25)",name="asset_code")
	private String assetCode;
	
	@Column(columnDefinition="VARCHAR(60)",name="description")
	private String description;
	
	@Column(columnDefinition="VARCHAR(50)",name="make")
	private String make;
	
	@Column(columnDefinition="VARCHAR(50)",name="model")
	private String model;
	
	@Column(precision = 5,name="year_of_manufacturing")
	private BigDecimal yearOfManufacturing;
	
	@Column(columnDefinition="VARCHAR(30)",name="chassis_number")
	private String chassisnumber;
	
	@Column(columnDefinition="VARCHAR(30)")
	private String engine_number;
	
	@Column(columnDefinition="VARCHAR(30)",name="engine_capacity")
	private String engineCapacity;
	
	@Column(columnDefinition="VARCHAR(30)",name="registeration_number")
	private String registerationNumber;
	
	@Column(precision=20,scale=3,name="original_cost")
	private BigDecimal originalCost;
	
	@Column(precision=20,scale=3,name="current_value")
	private BigDecimal currentValue;
	
	@Column(columnDefinition="VARCHAR(25)",name="status_of_asset")
	private String statusOfAsset;
	
	@Column(columnDefinition="VARCHAR(60)",name="misc_remark")
	private String miscRemark;
	
	@Column(columnDefinition="VARCHAR(25)",name="owner")
	private String owner;
	
	@Column(columnDefinition="VARCHAR(25)",name="owner_type")
	private String ownerType;
	
	@Column(name="valuation_date")
	private Date valuationDate;
	
	@Column(columnDefinition="VARCHAR(25)",name="built_area")
	private String builtArea;
	
	@Column(columnDefinition="VARCHAR(25)",name="area")
	private String area;
	
	@Column(columnDefinition="VARCHAR(25)",name="taluka")
	private String taluka;
	
	@Column(columnDefinition="VARCHAR(25)",name="district")
	private String district;
	
	@Column(columnDefinition="VARCHAR(25)",name="machinery_name_invoice_no")
	private String machineryNameInvoiceNo;
	
	@Column(columnDefinition="VARCHAR(1)",name="under_construction_yn")
	private String underConstructionYn;
	
	@Column(name="date_expected_completion")
	private Date dateExpectedCompletion;
	
	@Column(columnDefinition="VARCHAR(25)",name="construction_complete")
	private String constructionComplete;
	
	@Column(precision = 5,name="yrs_of_const_complete")
	private BigDecimal yrsOfConstComplete;
	
	@Column(columnDefinition="VARCHAR(20)",name="npa_flag")
	private String npaFlag;
	
	
}
