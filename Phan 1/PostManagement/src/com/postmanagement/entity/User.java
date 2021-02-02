package com.postmanagement.entity;

import java.util.List;

public class User {

	private long id;

	private String fullName;

	private List<Post> posts;

	private List<Comment> comments;

	public User(String fullName) {
		this.fullName = fullName;
	}

	void writePost(Post post) {

	}

	public long getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public List<Comment> getComments() {
		return comments;
	}

//	void deletePost(Post post) throws PostException { // Náº¿u tÃ¡c Ä‘á»™ng lÃªn dá»¯ liá»‡u náº¿u cÃ³ lá»—i thÃ¬ hÃ£y throw ra Exception
//
//	}

}
