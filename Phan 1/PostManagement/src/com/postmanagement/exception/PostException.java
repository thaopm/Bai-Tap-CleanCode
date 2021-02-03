package com.postmanagement.exception;

public class PostException extends Exception {

	private String exceptionContent;

	public PostException(String exceptionContent) {
		this.exceptionContent = exceptionContent;
	}

	public String getExceptionContent() {
		return exceptionContent;
	}

	public void setExceptionContent(String exceptionContent) {
		this.exceptionContent = exceptionContent;
	}

	@Override
	public String toString() {
		return "PostException [exceptionContent=" + exceptionContent + "]";
	}

}
