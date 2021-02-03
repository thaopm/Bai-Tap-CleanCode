package com.postmanagement.exception;

public class CommentException extends Exception {

	private String exceptionContent;

	public CommentException(String exceptionContent) {
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
		return "CommentException [exceptionContent=" + exceptionContent + "]";
	}

}
