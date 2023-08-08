package com.sakshath.core.response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AgrChargesDto {
	
	private String loanAccountNumber;
    private String paymentHead;
    private BigDecimal outstandingAmount;
    private BigDecimal amountPaidTillNow;
    private BigDecimal amountWaivedTillNow;
    private BigDecimal overdueAmount;

}
