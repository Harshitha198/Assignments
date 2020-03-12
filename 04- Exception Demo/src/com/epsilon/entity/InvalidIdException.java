package com.epsilon.entity;

public class InvalidIdException extends Exception {

	public InvalidIdException() {
		super();
		
	}

	public InvalidIdException(String message) {
		super(message);
	}

	public InvalidIdException(Throwable cause) {
		super(cause);
	
	}

}
