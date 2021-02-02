package com.pmt.postmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmt.postmanagement.entity.Post;
import com.pmt.postmanagement.entity.User;
import com.pmt.postmanagement.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private CommentService commentService;
	
	public void writePost(String title, String content, User user) {
		Post post = new Post(title, content, user);
		postService.addPost(post);
	}
	
	public void writeComment()
}
