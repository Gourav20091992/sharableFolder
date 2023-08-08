package com.sakshath.core.constant;


public interface ResponseMessage {

	/*
	 * Content-Type for JSON
	 */
	String APPLICATION_TYPE_JSON = "Content-Type, application/json";

	/*
	 * if object having null value
	 */
	String NULL_OBJECT_MESSAGE = "Object having null value";

	/*
	 * CRUD operation status messages
	 */
	// insert operation
	String RECORD_INSERTED_MESSAGE = "Record Inserted Successfully";
	String LOGIN_RECORD_INSERTED_MESSAGE = "Login Detail Inserted Successfully";
	String LOGOUT_MESSAGE = "Logout Successfully";
	String RECORD_INSERTION_FAILED_MESSAGE = "Record Insertion Failed";

	// update operation
	String RECORD_UPDATED_MESSAGE = "Record Updated Successfully";
	String RECORD_UPDATION_FAILED_MESSAGE = "Record Updated Failed";

	// fetch operation
	String RECORD_FETCH_BY_ID_MESSAGE = "Record Retrived Successfully";
	String RECORD_FETCH_BY_ID_FAILED_MESSAGE = "Record retrival failed";

	// fetch all operation
	String RECORD_FETCH_ALL_MESSAGE = "All Record Retrived Successfully";
	String RECORD_FETCH_ALL_FAILED_MESSAGE = "All Record's retrival failed";

	// delete operation
	String RECORD_DELETION_MESSAGE = "Record Deleted Successfully";
	String RECORD_DELETION_FAILED_MESSAGE = "Record deletion failed";

	/*
	 * HTTP Response status messages
	 */
	String SUCCESS = "Success";
	String FORM_VALIDATION_ERROR = "Form validation errors";
	String FORBIDDEN = "Forbidden";
	String NOT_FOUND = "Not Found";
	String UNSUPPORTED_MEDIA_TYPE = "Unsupported media type";
	String BAD_REQUEST = "Bad request";
	String UNAUTHORIZED = "Unauthorized!!";
	String INTERNAL_SERVER_ERROR = "Internal serevr error..!!";

	/*
	 * Custom messages for sending with response.
	 */
	String LOGIN_SUCCESSFULLY = "Login Successfully";
	String INVALID_USER_ID = "Invalid User Id";
	String ACCOUNT_LOCKED_MESSAGE = "Your account has been locked";
	String SIGNUP_FORM_VIEW_SUCCESS = "Registration form view Successfully";
	String USER_RECORD_ERROR_MESSAGE = "Object having null value in user created and updated date and id ";
	String CREATE_USER_RECORD_ERROR_MESSAGE = "Please try again. User not created";
	String AUTHENTICATION_FAIL = "Authentication fail due to wrong credential ";
	String ACCOUNT_LOCKED = "Your Account has been locked. Please contact with admin.";
	String ACCOUNT_EXPIRED = "Your Account has been expired. Please contact with admin.";
	String USER_DETAILS_NOT_FOUND = "No details found..!!";
	String PASSWORD_MATCH_ERROR = "Old password authentication failed.";
	String MOBILE_NO_NOT_FOUND = "Mobile number not present in system.";
	
	
	// customer Info 
	String CUSTOMER_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE = "Customer record not found by Customer Number";
	String CUSTOMER_INFO_RECORD_FETCH_BY_Name_FAILED_MESSAGE = "Customer record not found by First Name";

	//Address Info
	
	String ADDRESS_RECORD_FETCH_BY_ID_FAILED_MESSAGE = "Adress Record not found by Customer Number";
	
	//AgrCharges
	String AGR_CHARGES_RECORD_FETCH_BY_ID_FAILED_MESSAGE = "AgrCharges not found by Customer Number";
	
	//Agreement 
	String AGREEMENT_INFO_RECORD_FETCH_BY_ID_FAILED_MESSAGE = "Agreement record not found by Customer Number";
	
	//FinDetail
	String FINDETAIL_FETCH_ALL_FAILED_MESSAGE = "Record not found in database";
	
}