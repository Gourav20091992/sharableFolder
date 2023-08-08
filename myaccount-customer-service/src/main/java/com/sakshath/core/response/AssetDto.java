package com.sakshath.core.response;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class AssetDto {

	   private Long id;
	    private String loanAccountNumber;
	    private String typeOfAsset;
	    private BigDecimal assetSerialNo;
	    private String assetCode;
	    private String description;
	    private String make;
	    private String model;
	    private BigDecimal yearOfManufacturing;
	    private String chassisNumber;
	    private String engineNumber;
	    private String engineCapacity;
	    private String registrationNumber;
	    private BigDecimal originalCost;
	    private BigDecimal currentValue;
	    private String statusOfAsset;
	    private String miscRemark;
	    private String owner;
	    private String ownerType;
	    private Date valuationDate;
	    private String builtArea;
	    private String area;
	    private String taluka;
	    private String district;
	    private String machineryNameInvoiceNo;
	    private String underConstructionYn;
	    private Date dateExpectedCompletion;
	    private String constructionComplete;
	    private BigDecimal yrsOfConstComplete;
	    private String npaFlag;
	
}
