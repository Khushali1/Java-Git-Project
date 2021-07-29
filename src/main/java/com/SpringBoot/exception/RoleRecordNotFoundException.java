package com.SpringBoot.exception;

public class RoleRecordNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public RoleRecordNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public RoleRecordNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RoleRecordNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RoleRecordNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
