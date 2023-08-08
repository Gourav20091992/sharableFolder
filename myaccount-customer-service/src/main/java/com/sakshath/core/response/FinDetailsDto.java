package com.sakshath.core.response;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class FinDetailsDto {

	private Long id;
	private String loanAccountNumber;
	private BigDecimal paymentReferenceDate;
	private Date paymentPostingDate;
	private Date valueDate;
	private BigDecimal transactionCode;
	private BigDecimal paymentMode;
	private BigDecimal paymentAmount;
	private String narration;
	private String debitOrCredit;
	private String status;
	private String typeOfInstrument;
	private Date instrumentDate;
	private BigDecimal instrumentNumber;
	private Date depositDate;
	private String bankName;
	private String branchName;
	private BigDecimal receiptNumber;
	private Date bounceDate;
	private String bounceReason;
}
