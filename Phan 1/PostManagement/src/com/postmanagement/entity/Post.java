package com.postmanagement.entity;

import java.util.ArrayList;
import java.util.List;

public class Post {

	private long id;

	private String title;

	private String content;

	private User user;

	private List<Comment> comments;

	public Post(String title, String content, User user) {
		comments = new ArrayList<Comment>();
		this.title = title;
		this.content = content;
		this.user = user;
	}
	
	void addComment(Comment comment) {
		comments.add(comment);
		System.out.println("Comment added");
	}

	public void deleteComment(Comment comment) {
		comments.remove(comment);
		System.out.println("Comment deleted");
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
