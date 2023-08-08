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
@Table(name="agreement")
@Data
public class Agreement extends Auditable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "VARCHAR(20)",name="source_system_name")
	private String sourceSystemName;
	
	@Column(columnDefinition = "VARCHAR(20)",name="loan_account_number")
	private String loanAccountNumber;
	
	@Column(columnDefinition = "VARCHAR(20)",name="customer_number")
	private String customerNumber;
	
	@Column(columnDefinition = "VARCHAR(10)",name="account_status")
	private String accountStatus;
	
	@Column(columnDefinition = "VARCHAR(60)",name="branch_code")
	private String branchCode;
	
	@Column(columnDefinition = "VARCHAR(10)",name="portfolio_code")
	private String portfolioCode;
	
	@Column(columnDefinition = "VARCHAR(30)",name="loan_type")
	private String loanType;
	
	@Column(columnDefinition = "VARCHAR(15)",name="schema_code")
	private String schemaCode;
	
	@Column(columnDefinition = "VARCHAR(20)",name="application_reference_id")
	private String applicationReferenceId;
	
	@Column(columnDefinition = "VARCHAR(25)",name="sales_person")
	private String salesPerson;
	
	@Column(columnDefinition = "VARCHAR(10)",name="dealer_code")
	private String dealerCode;
	
	@Column(columnDefinition = "VARCHAR(50)",name="dealer_sale_person")
	private String dealerSalePerson;
	
	@Column(columnDefinition = "VARCHAR(3)",name="repayment_frequency")
	private String repaymentFrequency;
	
	@Column(columnDefinition = "VARCHAR(15)",name="payment_type")
	private String paymentType;
	
	@Column(name="disbursement_date")
	private Date disbursementDate;
	
	@Column(name="loan_start_date")
	private Date loanStartDate;
	
	@Column(name="loan_end_date")
	private Date loanEndDate;
	
	@Column(precision = 5,name="tenor")
	private BigDecimal tenor;
	
	@Column(precision = 2,name="cycle_day")
	private BigDecimal cycleDay;
	
	@Column(precision = 20,name="grace_days")
	private BigDecimal graceDays;
	
	@Column(precision = 20, scale=3,name="sanction_amount")
	private BigDecimal sanctionAmount;
	
	@Column(precision = 20, scale=3,name="loan_amount")
	private BigDecimal loanAmount;
	
	@Column(columnDefinition = "VARCHAR(15)",name="interat_rate_type")
	private BigDecimal interatRateType;
	
	@Column(columnDefinition = "VARCHAR(15)",name="plr")
	private BigDecimal plr;
	
	@Column(precision = 8, scale=5,name="margin")
	private BigDecimal margin;
	
	@Column(precision = 8, scale=5,name="actual_interest_rate")
	private BigDecimal actualInterestRate;
	
	@Column(precision = 20, scale=3,name="installment_amount")
	private BigDecimal installmentAmount;
	
	@Column(precision = 20, scale=3,name="downpayment")
	private BigDecimal downpayment;
	
	@Column(precision = 20, scale=3,name="downpayment_percentage")
	private BigDecimal downpaymentPercentage;
	
	@Column(columnDefinition = "VARCHAR(20)",name="bucket_code")
	private BigDecimal bucket_code;
	
	@Column(name="next_due_date")
    private Date nextDueDate;
	
    @Column(precision = 10, scale=0,name="od_days")
	private BigDecimal odDays;
    
    @Column(precision = 20, scale=3,name="excess_amount")
	private BigDecimal excessAmount;
    
    @Column(precision = 20, scale=3,name="last_amount_paid")
	private BigDecimal lastAmountPaid;
    
    private Date last_payment_date;
    
    @Column(precision = 15, scale=3,name="od_amount")
	private BigDecimal odAmount;
    
    @Column(precision = 15, scale=3,name="os_amount")
	private BigDecimal osAmount;
    
    @Column(length=1,name="write_off_flag")
    private String writeOffFlag;
    
    @Column(precision=20,scale=3,name="write_off_amount")
    private String writeOffAmount;
    
    @Column(name="write_off_date")
    private Date writeOffDate;
    
    @Column(columnDefinition = "VARCHAR(10)",name="write_off_reason1")
	private String writeOffReason1;
    
    @Column(name="delinquency_start_date")
    private Date delinquencyStartDate;
    
    @Column(columnDefinition = "VARCHAR(3)",name="non_starter_flag")
    private String nonStarterFlag;
    
    @Column(precision=15,scale=3,name="os_prin_ammount")
    private String osPrinAmmount;
    
    @Column(precision=15,scale=3,name="od_prin_ammount")
    private String odPrinAmmount;  
    
    @Column(columnDefinition = "VARCHAR(1)",name="repo_flag")
    private String repoFlag;
    
    @Column(columnDefinition = "CHAR(1)",name="loan_restructured_yn")
    private String loanRestructuredYn; 
    
    @Column(columnDefinition = "VARCHAR(20)",name=" restructured_scheme")
    private String restructuredScheme;
    
    @Column(columnDefinition = "CHAR(1)",name="morat_applied")
    private String moratApplied;
    
    @Column(columnDefinition = "VARCHAR(50)",name="morat_period")
    private String moratPeriod;
    
    @Column(columnDefinition = "VARCHAR(50)",name="psl_category")
    private String pslCategory;
    
    @Column(columnDefinition = "VARCHAR(100)",name="psl_sector")
    private String pslSector; 
    
    @Column(columnDefinition = "VARCHAR(100)",name="sub_category")
    private String subCategory;
    
    @Column(columnDefinition = "VARCHAR(100)",name="psl_investment_in_plant_machinary")
    private String pslInvestmentInPlantMachinary;
    
    @Column(columnDefinition = "VARCHAR(100)",name="psl_weeker_section")
    private String pslWeekerSection;
    
    @Column(columnDefinition = "VARCHAR(100)",name="psl_purpose")
    private String pslPurpose;
    
    @Column(columnDefinition = "VARCHAR(50)",name="gstn_number")
    private String gstnNumber;
    
    
}
