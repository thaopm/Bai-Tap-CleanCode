package com.postmanagement.entity;

public class Comment {
	private long id;
	private String title;

	private Post post;
	private User user;

	public Comment(String title, Post post, User user) {
		this.title = title;
		this.post = post;
		this.user = user;
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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
