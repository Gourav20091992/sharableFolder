package com.sakshath.core.constant;

public interface RestApiUrl {
	
	public static final String USER_BASE_URL = "/api/user";

	/*
	 * Customer Base URL for REST API's If Customer Logged..
	 */
	public static final String CUSTOMER_BASE_URL = "/api/customer";

	/*
	 * URL to add new record.
	 */
	public static final String ADD_URL = "/add";

	/*
	 * URL to delete new record.
	 */
	public static final String DELETE_URL = "/delete/{id}";

	/*
	 * URL to update existing record.
	 */
	public static final String UPDATE_URL = "/update/{id}";

	/*
	 * URL to retrieve specific record.
	 */
	public static final String GET_URL = "/get/{id}";

	/*
	 * URL to Retrieve all record's.
	 */
	public static final String GET_ALL_URL = "/getAll";


	/*
	 * API for Controllers
	 */

	/*
	 * CustomersInfo Controller.
	 */
	public static final String CUSTOMER_TYPE_TAGS = "customer-info";
	public static final String CUSTOMER_TYPE_API = CUSTOMER_BASE_URL + "/" + CUSTOMER_TYPE_TAGS;
	
	
	//Address controller
	public static final String ADDRESS_TYPE_TAGS="address";
	public static final String ADDRESS_TYPE_API=CUSTOMER_BASE_URL+"/"+ADDRESS_TYPE_TAGS;
	public static final String GET_ADDRESS_URL = "/getAddress/{customerNumber}";
	
	//AgrCharges
	public static final String AGRCHARGES_TYPE_TAGS="agrCharges";
	public static final String AGRCHARGES_TYPE_API=CUSTOMER_BASE_URL+"/"+AGRCHARGES_TYPE_TAGS;
	public static final String GET_AGRCHARGES ="/getAgrCharges/{customerNumber}";
	
	//Agreement controller
	public static final String AGREEMENT_TYPE_TAGS="agreement";
	public static final String AGREEMENT_TYPE_API=CUSTOMER_BASE_URL+"/"+AGREEMENT_TYPE_TAGS;
	public static final String GET_AGREEMENT_URL = "/getAgreement/{customerNumber}";
	
	//ApplicationLeads controller
	public static final String APPLICAITON_LEADS_TYPE_TAGS="applicationLeads";
	public static final String APPLICATION_LEADS_API=CUSTOMER_BASE_URL+"/"+APPLICAITON_LEADS_TYPE_TAGS;
	
	//Asset controller
	public static final String ASSET_TYPE_TAGS="asset";
	public static final String ASSET_API=CUSTOMER_BASE_URL+"/"+ASSET_TYPE_TAGS;
	public static final String GET_ASSET_URL = "/getAsset/{loanAccountNumber}";
	
	//Bucket controller
	public static final String BUCKET_TYPE_TAGS="bucket";
	public static final String BUCKET_TYPE_API=CUSTOMER_BASE_URL+"/"+BUCKET_TYPE_TAGS;
	public static final String GET_BUCKET_URL = "/getBucket/{loanAccountNumber}";
	
    //CustomerRelationship controller
	public static final String CUSTOMER_RELATIONSHIP_TYPE_TAGS="customerRelationship";
	public static final String CUSTOMER_RELATIONSHIP_TYPE_API=CUSTOMER_BASE_URL+"/"+ADDRESS_TYPE_TAGS;
	public static final String GET_CUSTOMER_RELATIONSHIP_URL = "/getCustomerRelationship/{customerNumber}";
	
	//EmailMaster controller
	public static final String EMAIL_MASTER_TYPE_TAGS="email";
	public static final String EMAIL_MASTER_TYPE_API=CUSTOMER_BASE_URL+"/"+ADDRESS_TYPE_TAGS;
	public static final String GET_EMAIL_MASTER_URL = "/getEmailMaster/{customerNumber}";
	
	//FinDetails controller
	public static final String FIN_DETAILS_TYPE_TAGS="finDetails";
	public static final String FIN_DETAILS_TYPE_API=CUSTOMER_BASE_URL+"/"+ADDRESS_TYPE_TAGS;
	public static final String GET_FIN_DETAILS_URL = "/getFinDetails/{customerNumber}";
	
	//phoneMaster controller
	public static final String PHONE_MASTER_TYPE_TAGS="phoneMaster";
	public static final String PHONE_MASTER_TYPE_API=CUSTOMER_BASE_URL+"/"+ADDRESS_TYPE_TAGS;
	public static final String GET_PHONE_MASTER_URL = "/getPhoneMaster/{loanAccountNumber}";
	
	//Schedule controller
	public static final String SCHEDULE_TYPE_TAGS="schedule";
	public static final String SCHEDULE_TYPE_API=CUSTOMER_BASE_URL+"/"+ADDRESS_TYPE_TAGS;
	public static final String GET_SCHEDULE_URL = "/getSchedule/{customerNumber}";
	
	//UcicMaster Controller
	public static final String UCIC_MASTER_TYPE_TAGS="ucicMaster";
	public static final String UCIC_MASTER_TYPE_API=CUSTOMER_BASE_URL+"/"+ADDRESS_TYPE_TAGS;
	public static final String GET_UCIC_MASTER_URL = "/getUcicMaster/{customerNumber}";
	
	
	//Login controller
		public static final String LOGIN_TAGS="login";
		public static final String LOGIN_API=USER_BASE_URL+"/"+LOGIN_TAGS;
		public static final String GET_LOGIN_URL="getLogin";
		public static final String VALIDATE_USER_URL="validateCredentials";
		
	
}
