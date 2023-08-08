package com.sakshath.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable  {


	@Column(name = "created_date", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	Date createdDate;

	@Column(name = "created_by", updatable = false)
	@CreatedBy
	String createdBy;
	

	@Column(name = "is_active")
	protected boolean isActive = true;


	@Column(name = "is_deleted")
	private boolean isDeleted = false;
	

	@Column(name="source_system")
	private String sourceSystem;


	
	
}