package com.sakshath.core.response;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class BucketDto {

	private Long id;
    private String loanAccountNumber;
    private String bucketCode;
    private BigDecimal overDueAmount;
    private Date runTime;
}
