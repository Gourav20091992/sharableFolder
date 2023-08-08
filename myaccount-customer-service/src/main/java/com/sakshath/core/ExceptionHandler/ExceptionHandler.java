package com.sakshath.core.ExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sakshath.core.Exception.AddressException;
import com.sakshath.core.Exception.AgrChargesException;
import com.sakshath.core.Exception.AgreementException;
import com.sakshath.core.Exception.ApplicationLeadsException;
import com.sakshath.core.Exception.AssetException;
import com.sakshath.core.Exception.BucketException;
import com.sakshath.core.Exception.CustomerInfoException;
import com.sakshath.core.Exception.CustomerRelationshipException;
import com.sakshath.core.Exception.DataNotFoundException;
import com.sakshath.core.Exception.EmailMasterException;
import com.sakshath.core.Exception.FinDetailsException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;
import com.sakshath.core.Exception.PhoneMasterException;
import com.sakshath.core.Exception.ScheduleException;
import com.sakshath.core.Exception.UcicMasterException;
import com.sakshath.core.response.Response;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

	Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

	@org.springframework.web.bind.annotation.ExceptionHandler(FormValidationException.class)
	public final ResponseEntity<Response<?>> handleFormValidationException(FormValidationException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside FormValidationException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside FormValidationException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(DataNotFoundException.class)
	public final ResponseEntity<Response<?>> handleDataNotFoundException(DataNotFoundException ex, WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside DataNotFoundException : " + ex.getMessage());
		logger.error(" ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(InvalidAuthenticationException.class)
	public final ResponseEntity<Response<?>> handleInvalidAuthenticationException(InvalidAuthenticationException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside InvalidAuthenticationException : " + ex.getMessage());
		logger.error(" ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(CustomerInfoException.class)
	public final ResponseEntity<Response<?>> handleCustomerInfoException(CustomerInfoException ex, WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside CustomerInfoException : " + ex.getMessage());
		logger.error(" ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);	
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(AddressException.class)
	public final ResponseEntity<Response<?>> handleAddressException(AddressException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside AddressException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside AddressException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(AgrChargesException.class)
	public final ResponseEntity<Response<?>> handleAgrChargesException(AgrChargesException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside AgrChargesException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside AgrChargesException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(AgreementException.class)
	public final ResponseEntity<Response<?>> handleAgreementException(AgreementException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside AgreementException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside AgreementException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(ApplicationLeadsException.class)
	public final ResponseEntity<Response<?>> handleApplicationLeadsException(ApplicationLeadsException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside ApplicationLeadsException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside ApplicationLeadsException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(AssetException.class)
	public final ResponseEntity<Response<?>> handleAssetException(AssetException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside AssetException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside AssetException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(BucketException.class)
	public final ResponseEntity<Response<?>> handleBucketException(BucketException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside BucketException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside BucketException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(CustomerRelationshipException.class)
	public final ResponseEntity<Response<?>> handleCustomerRelationshipException(CustomerRelationshipException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside CustomerRelationshipException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside CustomerRelationshipException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(EmailMasterException.class)
	public final ResponseEntity<Response<?>> handleEmailMasterException(EmailMasterException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside EmailMasterException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside EmailMasterException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(FinDetailsException.class)
	public final ResponseEntity<Response<?>> handleFinDetailsException(FinDetailsException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside FinDetailsException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside FinDetailsException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(PhoneMasterException.class)
	public final ResponseEntity<Response<?>> handlePhoneMasterException(PhoneMasterException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside PhoneMasterException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside PhoneMasterException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(ScheduleException.class)
	public final ResponseEntity<Response<?>> handleScheduleException(ScheduleException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside ScheduleException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside ScheduleException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(UcicMasterException.class)
	public final ResponseEntity<Response<?>> handleUcicMasterException(UcicMasterException ex,
			WebRequest request) {
		logger.error(">>>>>>>>>>>>>>>Inside UcicMasterException : " + ex.getMessage());
		logger.error(">>>>>>>>>>>>>>>Inside UcicMasterException : ", ex);
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}

}