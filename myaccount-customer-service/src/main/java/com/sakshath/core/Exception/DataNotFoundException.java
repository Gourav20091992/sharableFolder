
package com.sakshath.core.Exception;

import com.sakshath.core.response.Response;

public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private Response<String> response;
	
	
	
	public DataNotFoundException(Response<String> response) {
		super();
		this.response = response;
	}
	public Response<String> getResponse() {
		return response;
	}
	public void setResponse(Response<String> response) {
		this.response = response;
	}
}
