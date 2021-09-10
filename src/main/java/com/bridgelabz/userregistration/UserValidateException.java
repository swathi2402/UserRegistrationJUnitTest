package com.bridgelabz.userregistration;

public class UserValidateException extends Exception{
	
	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}
	ExceptionType type;

	public UserValidateException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}