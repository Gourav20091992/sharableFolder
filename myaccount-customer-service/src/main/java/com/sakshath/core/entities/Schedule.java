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
@Table(name="schedule")
public class Schedule extends Auditable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Long id;
	
	@Column(columnDefinition="VARCHAR(20)",name="loan_account_number")
	private String loanAccountNumber;
	
	@Column(precision=5,name="installment_number")
	private BigDecimal installmentNumber;
	
	@Column(name="due_date")
	private Date dueDate;
	
	@Column(precision=15,scale=3,name="installment_amount")
	private BigDecimal installmentAmount;
	
	@Column(precision=20,scale=3,name="principal_part_of_installment")
	private BigDecimal principalPartOfInstallment;
	
	@Column(precision=20,scale=3,name="interest_part_of_installment")
	private BigDecimal interestPartOfInstallment;
	
	@Column(precision=20,scale=3,name="tds_part_of_installment")
	private BigDecimal tdsPartOfInstallment;
	
	@Column(name="installment_amount_paid_till_date")
	private	Date installmentAmountPaidTillDate;
	
	@Column(precision=20,scale=3,name="principal_amount_paid")
	private	BigDecimal principalAmountPaid;
	
	@Column(precision=20,scale=3,name="interest_amount_paid")
	private BigDecimal interestAmountPaid;
	
	@Column(precision=20,scale=3,name="tds_amount_paid")
	private BigDecimal tdsAmountPaid;
	
	@Column(precision=20,scale=3,name="balance_part_of_installment")
	private BigDecimal balancePartOfInstallment;
	
	@Column(name="last_payment_date")
	private Date lastPaymentDate;
	
	@Column(columnDefinition="VARCHAR(20)",name="status")
	private String status;

}
