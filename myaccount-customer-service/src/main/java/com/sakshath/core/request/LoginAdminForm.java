package com.sakshath.core.request;

import java.io.Serializable;

import lombok.Data;

@Data
public class LoginAdminForm implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String emailId;
	private String password;
	private Long roleId;
	
	
	
	

}
