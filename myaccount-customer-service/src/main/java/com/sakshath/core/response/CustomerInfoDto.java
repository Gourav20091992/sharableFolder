package com.sakshath.core.response;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class CustomerInfoDto {
	
	private String companyCode;
    private String sourceSystemName;
    private String prefContactAddType;
    private String customerId;
    private String prefMailAddType;
    private String groupId;
    private String groupName;
    private String customerType;
    private String customerCategory;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private Date dob;
    private String nationality;
    private String maritalStatus;
    private String fatherName;
    private String motherName;
    private String panNumber;
    private String aadhaarNumber;
    private String passportNumber;
    private String drivingLicenseNumber;
    private String otherIdentityCardNumber;
    private String occupationType;
    private String employerName;
    private String designation;
    private BigDecimal yearsOfEmployment;
    private String industryName;
    private BigDecimal annualIncome;
    private BigDecimal familyIncome;
    private String bankAccountNumber;
    private String bankName;
    private String bankIFSC;
    private String bankMICR;
    private String emailId;
    private String mobileNumber;
    private String contactPerson;
    private String customerRiskCategory;
    private String customerSegment;
    private String cin;
    private String gstin;
    private String tan;

}
