package com.sakshath.core.entities;

import java.math.BigDecimal;
import java.util.Date;

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
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(columnDefinition = "VARCHAR(10)",name = "company_code")
	private String companyCode;

	@Column(columnDefinition = "VARCHAR(20)",name = "source_system_name")
	private String sourceSystemName;

	@Column(columnDefinition = "VARCHAR(2)",name = "preferred_contact_address_type")
	private String prefContactAddType;

	@Column(columnDefinition = "VARCHAR(20)",name = "customer_number")
	private String customerNumber;

	@Column(columnDefinition = "VARCHAR(2)",name = "preferred_mailing_address_type")
	private String prefMailAddType;

	@Column(columnDefinition = "VARCHAR(20)",name = "group_id")
	private String groupId;

	@Column(columnDefinition = "VARCHAR(50)",name = "group_name")
	private String groupName;

	@Column(columnDefinition = "VARCHAR(1)",name = "customer_type")
	private String customerType;

	@Column(columnDefinition = "VARCHAR(50)",name = "customer_category")
	private String customerCategory;

	@Column(columnDefinition = "VARCHAR(15)",name = "title")
	private String title;

	@Column(columnDefinition = "VARCHAR(80)",name = "first_name")
	private String firstName;

	@Column(columnDefinition = "VARCHAR(80)",name = "middle_name")
	private String middleName;

	@Column(columnDefinition = "VARCHAR(80)",name = "last_name")
	private String lastName;

	@Column(columnDefinition = "VARCHAR(1)",name = "gender")
	private String gender;

	@Column(name = "date_of_birth")
	private Date dob;

	@Column(columnDefinition = "VARCHAR(25)",name = "nationality")
	private String nationality;

	@Column(columnDefinition = "VARCHAR(15)",name = "marital_status")
	private String maritalStatus;

	@Column(columnDefinition = "VARCHAR(80)",name = "father_name")
	private String fatherName;

	@Column(columnDefinition = "VARCHAR(80)",name = "mother_name")
	private String motherName;

	@Column(columnDefinition = "VARCHAR(20)",name = "pan_number")
	private String panNumber;

	@Column(columnDefinition = "VARCHAR(20)",name = "aadhaar_number")
	private String aadhaarNumber;

	@Column(columnDefinition = "VARCHAR(12)",name = "passport_number	")
	private String passportNumber;

	@Column(columnDefinition = "VARCHAR(30)",name = "driving_license_number")
	private String drivingLicenseNumber;

	@Column(columnDefinition = "VARCHAR(30)",name = "other_identity_card_number")
	private String otherIdentityCardNumber;

	@Column(columnDefinition = "VARCHAR(20)",name = "occupation_type")
	private String occupationType;

	@Column(columnDefinition = "VARCHAR(60)",name = "employer_name")
	private String employerName;

	@Column(columnDefinition = "VARCHAR(60)",name = "designation")
	private String designation;

	@Column(precision=4,name = "years_of_employment")
	private BigDecimal yearsOfEmployment;

	@Column(columnDefinition = "VARCHAR(15)",name = "industry_name")
	private String industryName;

	@Column(precision=20,scale=3,name = "annual_income")
	private BigDecimal annualIncome;

	@Column(precision=20,scale=3,name = "family_income")
	private BigDecimal familyIncome;

	@Column(columnDefinition = "VARCHAR(20)",name = "bank_account_number")
	private String bankAccountNumber;

	@Column(columnDefinition = "VARCHAR(60)",name = "bank_name")
	private String bankName;

	@Column(columnDefinition = "VARCHAR(30)",name = "bank_ifsc")
	private String bankIFSC;

	@Column(columnDefinition = "VARCHAR(30)",name = "bank_miscr")
	private String bankMICR;

	@Column(columnDefinition = "VARCHAR(30)",name = "email_id")
	private String emailId;

	@Column(columnDefinition = "VARCHAR(10)",name = "mobile_number")
	private String mobileNumber;

	@Column(columnDefinition = "VARCHAR(150)",name = "contact_person")
	private String contactPerson;

	@Column(columnDefinition = "VARCHAR(30)",name = "customer_risk_category")
	private String customerRiskCategory;

	@Column(columnDefinition = "VARCHAR(5)",name = "customer_segment")
	private String customerSegment;

	@Column(columnDefinition = "VARCHAR(30)",name = "cin")
	private String cin;

	@Column(columnDefinition = "VARCHAR(30)",name = "gstin")
	private String gstin;

	@Column(columnDefinition = "VARCHAR(30)",name = "tan")
	private String tan;
	

	
	

}
