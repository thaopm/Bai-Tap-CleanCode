package com.postmanagement.exception;

public class PostException extends Exception {
	
	private String exceptionContent;

	public PostException(String exceptionContent) {
		this.exceptionContent = exceptionContent;
	}
	
}
