
  package com.sakshath.core.entities;
  
  import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
  
  @Entity
  @Table(name="argcharges") 
  @Data
  public class AgrCharges extends Auditable {
	  
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  @Column(columnDefinition = "VARCHAR(20)",name="loan_account_number")
	  private String loanAccountNumber;
	  
	  @Column(columnDefinition = "VARCHAR(5)",name="payment_head")
	  private String paymentHead;
	  
	  @Column(precision=15, scale=3,name="outstanding_amount")
	  private BigDecimal outstandingAmount;
	  
	  @Column(precision=15, scale=3,name="amount_paid_till_now")
	  private BigDecimal amountPaidTillNow;
	  
	  @Column(precision=15, scale=3,name="amount_waived_till_now")
	  private BigDecimal amountWaivedTillNow;
	  
	  @Column(precision=15, scale=3,name="overdue_amount")
	  private BigDecimal overdueAmount;
	  
  
  }
 