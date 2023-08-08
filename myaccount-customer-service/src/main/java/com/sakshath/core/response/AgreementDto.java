package com.sakshath.core.response;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class AgreementDto {

    private String sourceSystemName;
    private String loanAccountNumber;
    private String customerNumber;
    private String accountStatus;
    private String branchCode;
    private String portfolioCode;
    private String loanType;
    private String schemaCode;
    private String applicationReferenceId;
    private String salesPerson;
    private String dealerCode;
    private String dealerSalePerson;
    private String repaymentFrequency;
    private String paymentType;
    private Date disbursementDate;
    private Date loanStartDate;
    private Date loanEndDate;
    private BigDecimal tenor;
    private BigDecimal cycleDay;
    private BigDecimal graceDays;
    private BigDecimal sanctionAmount;
    private BigDecimal loanAmount;
    private BigDecimal interatRateType;
    private BigDecimal plr;
    private BigDecimal margin;
    private BigDecimal actualInterestRate;
    private BigDecimal installmentAmount;
    private BigDecimal downpayment;
    private BigDecimal downpaymentPercentage;
    private BigDecimal bucket_code;
    private Date nextDueDate;
    private BigDecimal odDays;
    private BigDecimal excessAmount;
    private BigDecimal lastAmountPaid;
    private Date last_payment_date;
    private BigDecimal odAmount;
    private BigDecimal osAmount;
    private String writeOffFlag;
    private String writeOffAmount;
    private Date writeOffDate;
    private String writeOffReason1;
    private Date delinquencyStartDate;
    private String nonStarterFlag;
    private String osPrinAmmount;
    private String odPrinAmmount;
    private String repoFlag;
    private String loanRestructuredYn;
    private String restructuredScheme;
    private String moratApplied;
    private String moratPeriod;
    private String pslCategory;
    private String pslSector;
    private String subCategory;
    private String pslInvestmentInPlantMachinary;
    private String pslWeekerSection;
    private String pslPurpose;
    private String gstnNumber;
}
