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
@Table(name="fin_details")
@Data
public class FinDetails extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "VARCHAR(20)",name="loan_account_number")
	private String loanAccountNumber;
	
	@Column(columnDefinition = "NUMERIC(10)",name="payment_reference_date")
	private BigDecimal paymentReferenceDate;
	
	@Column(name="payment_posting_date")
	private Date paymentPostingDate; 
	
	@Column(name="value_date")
	private Date valueDate;
	
	@Column(columnDefinition= "VARCHAR(20)",name="transaction_code")
	private BigDecimal transactionCode;
	
	@Column(columnDefinition= "VARCHAR(30)",name="payment_mode")
	private BigDecimal paymentMode;
	
	@Column(precision=20, scale=3,name="payment_amount")
	private BigDecimal paymentAmount;
	
	@Column(columnDefinition="VARCHAR(150)",name="narration")
	private String narration;
	
	@Column(columnDefinition="VARCHAR(20)",name="debit_or_credit")
	private String debitOrCredit;
	
	@Column(columnDefinition="VARCHAR(3)",name="status")
	private String status;
	
	@Column(columnDefinition="VARCHAR(3)",name="type_of_instrument")
	private String type_of_instrument;
	
	@Column(name="instrument_date")
	private Date instrumentDate;
	
	@Column(columnDefinition = "NUMERIC(10)",name="instrument_number")
	private BigDecimal instrumentNumber;
	
	@Column(name="deposit_date")
	private Date depositDate;
	
	@Column(columnDefinition = "VARCHAR(20)",name="bank_name")
	private String bankName;
	
	@Column(columnDefinition = "VARCHAR(20)",name="branch_name")
	private String branchname;
	
	@Column(columnDefinition = "NUMERIC(10)",name="receipt_number")
	private BigDecimal receiptnumber;
	
	@Column(name="bounce_date")
	private Date bounceDate;
	
	@Column(columnDefinition = "VARCHAR(100)",name="bounce_reason")
	private String bounceReason;
	
	
}
