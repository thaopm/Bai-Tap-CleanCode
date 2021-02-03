package com.postmanagement.app;

import com.postmanagement.entity.Comment;
import com.postmanagement.entity.Post;
import com.postmanagement.entity.User;
import com.postmanagement.exception.CommentException;
import com.postmanagement.exception.PostException;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("Thao");
		Post post1 = user1.writePost("Post 1", "Content post 1");
		Comment comment1 = user1.writeComent("Comment 1", post1);
		
		User user2 = new User("Thao");
		Post post2 = user2.writePost("Post 1", "Content post 1");
		Comment comment2 = user2.writeComent("Comment 1", post2);
		
		try {
			user1.deleteComment(comment1);
			user2.deleteComment(comment2);
			user1.deletePost(post2);
		} catch (CommentException e) {
			e.printStackTrace();
		} catch (PostException ex) {
			ex.printStackTrace();
		}
		
	}
}
