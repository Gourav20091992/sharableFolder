package com.sakshath.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "findetails")
@Data
public class FinDetailIndus {

	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;

	@Id
	@Column(name = "ITRANSEQNO")
	private String iTransSeqNo;

	@Column(name = "SZORGCODE")
	private String szOrgCode;

	@Column(name = "IAGREEMENTSEQNO")
	private String iAgreementSeqNo;

	@Column(name = "DTTRANDATE")
	private String dtTranDate;

	@Column(name = "DTVALUEDATE")
	private String dtValueDate;

	@Column(name = "SZTYPE")
	private String szType;

	@Column(name = "SZDRORCR")
	private String szDrOrCr;

	@Column(name = "SZTRANSACTIONCODE")
	private String szTransactionCode;

	@Column(name = "FAMOUNT")
	private String fAmount;

	@Column(name = "SZCURRENCYCODE")
	private String szCurrencyCode;

	@Column(name = "SZNARRATION")
	private String szNarration;

	@Column(name = "SZAUTHCODE")
	private String szAuthCode;

	@Column(name = "SZPLANNO")
	private String szPlanNo;

	@Column(name = "SZTRANREFNO")
	private String szTranRefNo;

	@Column(name = "SZMERCHANTSTOREID")
	private String szMerchantStoreId;

	@Column(name = "SZMERCHANTCATCODE")
	private String szMerchantCatCode;

	@Column(name = "SZLOGICMODULE")
	private String szLogicModule;

	@Column(name = "SZRPTDESC")
	private String szRptDesc;

	@Column(name = "SZTRANSOURCE")
	private String szTranSource;

	@Column(name = "SZTRANSTATUS")
	private String szTranStatus;

	@Column(name = "SZINSTRUMENTTYPE")
	private String szInstrumentType;

	@Column(name = "DTINSTRUMENTDATE")
	private String dtInstrumentDate;

	@Column(name = "SZINSTRUMENTNO")
	private String szInstrumentNo;

	@Column(name = "SZBANKNAME")
	private String szBankName;

	@Column(name = "SZBRANCHNAME")
	private String szBranchName;

	@Column(name = "SZCOLLECTORCODE")
	private String szCollectorCode;

	@Column(name = "SZCOLLECTORGRPCODE")
	private String szCollectorGrpCode;

	@Column(name = "CPORTFOLIOCODE")
	private String cPortfolioCode;

	@Column(name = "SZBUCKETCODE")
	private String szBucketCode;

	@Column(name = "IODDAYS")
	private String ioDays;

	@Column(name = "FOVERDUEAMT")
	private String fOverdueAmt;

	@Column(name = "FOSAMT")
	private String fOsAmt;

	@Column(name = "SZBOOKNO")
	private String szBookNo;

	@Column(name = "SZRECEIPTNO")
	private String szReceiptNo;

	@Column(name = "IBOOKNO")
	private String iBookNo;

	@Column(name = "IRECEIPTNO")
	private String iReceiptNo;

	@Column(name = "SZFIELD1")
	private String szField1;

	@Column(name = "SZFIELD2")
	private String szField2;

	@Column(name = "SZFIELD3")
	private String szField3;

	@Column(name = "SZFIELD4")
	private String szField4;

	@Column(name = "SZFIELD5")
	private String szField5;

	@Column(name = "CFLAG1")
	private String cFlag1;

	@Column(name = "CFLAG2")
	private String cFlag2;

	@Column(name = "CFLAG3")
	private String cFlag3;

	@Column(name = "CFLAG4")
	private String cFlag4;

	@Column(name = "CFLAG5")
	private String cFlag5;

	@Column(name = "DTDATE1")
	private String dtDate1;

	@Column(name = "DTDATE2")
	private String dtDate2;

	@Column(name = "DTDATE3")
	private String dtDate3;

	@Column(name = "DTDATE4")
	private String dtDate4;

	@Column(name = "DTDATE5")
	private String dtDate5;

	@Column(name = "FAMOUNT1")
	private String fAmount1;

	@Column(name = "FAMOUNT2")
	private String fAmount2;

	@Column(name = "FAMOUNT3")
	private String fAmount3;

	@Column(name = "FAMOUNT4")
	private String fAmount4;

	@Column(name = "FAMOUNT5")
	private String fAmount5;

	@Column(name = "INUMBER1")
	private String iNumber1;

	@Column(name = "INUMBER2")
	private String iNumber2;

	@Column(name = "INUMBER3")
	private String iNumber3;

	@Column(name = "INUMBER4")
	private String iNumber4;

	@Column(name = "INUMBER5")
	private String iNumber5;

	@Column(name = "FUPDATEDOSAMT")
	private String fUpdatedOsAmt;

	@Column(name = "SZUSERID")
	private String szUserId;

	@Column(name = "DTUPDTIMESTAMP")
	private String dtUpdTimestamp;

	@Column(name = "SZPARTITIONCODE")
	private String szPartitionCode;

	@Column(name = "SZRELATEDXREFNO")
	private String szRelatedXRefNo;

	@Column(name = "SZWFCODE")
	private String szWfCode;

	@Column(name = "SZWFSTATECODE")
	private String szWfStateCode;

	@Column(name = "IANPEXECLOGSEQNO")
	private String iAnpExecLogSeqNo;

	@Column(name = "CANPSTATUS")
	private String cAnpStatus;

	@Column(name = "CPAYMENTYN")
	private String cPaymentYN;

	@Column(name = "CREVERSALYN")
	private String cReversalYN;

	@Column(name = "FCUROSAMT")
	private String fCuroAmt;

	@Column(name = "SZTRANREFNO1")
	private String szTranRefNo1;

	@Column(name = "SourceSystemName")
	private String sourceSystemName;

}
