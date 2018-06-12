package com.ubs.opsit.exception;

public class InvalidTimeException extends Exception {

	private String message;
	
	public InvalidTimeException(String message){
		this.message=message;
	}

	@Override
	public String toString() {
		return "InvalidTimeException [message=" + message + "]";
	}
	
}
