package com.postmanagement.entity;

import java.util.ArrayList;
import java.util.List;

import com.postmanagement.exception.CommentException;
import com.postmanagement.exception.PostException;

public class User {

	private long id;

	private String fullName;

	private List<Post> posts;

	private List<Comment> comments;

	public User(String fullName) {
		posts = new ArrayList<Post>();
		comments = new ArrayList<Comment>();
		this.fullName = fullName;
	}

	public Post writePost(String title, String content) {
		Post post = new Post(title, content, this);
		posts.add(post);
		System.out.println("Comment added");
		return post;
	}

	public Comment writeComent(String title, Post post) {
		Comment comment = new Comment(title, post, this);
		post.addComment(comment);
		comments.add(comment);
		return comment;
	}
	
	public void deletePost(Post post) throws PostException {
		if (posts.contains(post)) {
			posts.remove(post);
			System.out.println("Comment deleted");
		} else {
			throw new PostException("Can't delete others' post");
		}
	}
	
	public void deleteComment(Comment comment) throws CommentException {
		if (comments.contains(comment)) {
			comments.remove(comment);
			comment.getPost().deleteComment(comment);
		} else {
			throw new CommentException("Can't delete others' comment");
		}
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

}
