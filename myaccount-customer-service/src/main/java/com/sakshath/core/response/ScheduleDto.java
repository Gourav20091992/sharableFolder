package com.sakshath.core.response;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ScheduleDto {

	private Long id;
    private String loanAccountNumber;
    private BigDecimal installmentNumber;
    private Date dueDate;
    private BigDecimal installmentAmount;
    private BigDecimal principalPartOfInstallment;
    private BigDecimal interestPartOfInstallment;
    private BigDecimal tdsPartOfInstallment;
    private Date installmentAmountPaidTillDate;
    private BigDecimal principalAmountPaid;
    private BigDecimal interestAmountPaid;
    private BigDecimal tdsAmountPaid;
    private BigDecimal balancePartOfInstallment;
    private Date lastPaymentDate;
    private String status;
    
	
}
