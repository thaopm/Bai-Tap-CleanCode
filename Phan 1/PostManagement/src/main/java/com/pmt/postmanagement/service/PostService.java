package com.pmt.postmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmt.postmanagement.entity.Post;
import com.pmt.postmanagement.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public void addPost(Post post) {
		postRepository.save(post);
	}

}
