package com.sakshath.core.Exception;

import com.sakshath.core.response.Response;

public class InvalidAuthenticationException extends Exception {


	private static final long serialVersionUID = 1L;
	private Response<?> response;

	public InvalidAuthenticationException(Response<?> response) {

		super(response.getMessage());
		this.response = response;

	}

	public Response<?> getResponse() {
		return response;
	}

	public void setResponse(Response<?> response) {
		this.response = response;
	}
}
