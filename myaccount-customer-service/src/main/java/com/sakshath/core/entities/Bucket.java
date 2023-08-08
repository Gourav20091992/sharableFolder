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
@Table(name="bucket")
@Data
public class Bucket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "VARCHAR(50)",name="loan_account_number")
	private String loanAccountNumber;
	
	@Column(columnDefinition = "VARCHAR(20)",name="bucket_code")
	private String bucketCode;
	
	@Column(precision=15, scale=3,name="over_due_amount")
	private BigDecimal overDueAmount;
	
	@Column(name="run_time")
	private Date run_time;

}
