//package com.sakshath.core.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name="user")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class UserEntity extends Auditable {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	@Column(columnDefinition = "VARCHAR(30)",name="emailId")
//	private String emailId;
//	
//
//	@Column(columnDefinition = "VARCHAR(30)",name = "password")
//	private String password;
//	
//	@Column(columnDefinition = "VARCHAR(20)",name = "role")
//	private Long role;
//}
